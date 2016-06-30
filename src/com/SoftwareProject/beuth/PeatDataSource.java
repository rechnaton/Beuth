package com.SoftwareProject.beuth;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import android.widget.Toast;

/*Diese Klasse ist Data Access Object und für Verwalten der Daten verantwortlich
 * - unterhält die Datenbankverbindung 
 * - ist für Hinzufügen, Auslesen und Löschen von Datensätzen zuständig
 * - wandelt Datensätze in Java-Objekte um
 * 		(So dass Code der Benutzeroberfläche nicht direkt mit den Datensätzen arbeiten muss.
 * 		Dies nennt man auch mehrschichtige Architektur.)
 * */

public class PeatDataSource {

    private static final String LOG_TAG = PeatDataSource.class.getSimpleName();

    private SQLiteDatabase database;
    private PeatDbHelper dbHelper;


    public PeatDataSource(Context context) {
        Log.d(LOG_TAG, "DataSource erzeugt dbHelper");
        dbHelper = new PeatDbHelper(context);
    }
    
    public void open() {
	    Log.d(LOG_TAG, "Eine Referenz auf die Datenbank wird jetzt angefragt.");
	    database = dbHelper.getWritableDatabase();
	    Log.d(LOG_TAG, "Datenbank-Referenz erhalten. Pfad zur Datenbank: " + database.getPath());
    }
    
    public void putQuestionInDB(Question oQuestion) {
    	String[] answers;
    	String theme;
    	Boolean[] bool_isCorrect;
    	Integer boolSqlite =0;
    	Integer i;
    	String sSql;
    	sSql = "INSERT INTO " + dbHelper.TABLE_QUESTIONS + " (qst_idQuestionType,qst_text) VALUES(" + getIdFromQuestionTypeTitle(oQuestion.getQuestionTypeTitle()) + 
    			", '" + oQuestion.getQuestionText() +"')";
    	Log.d(LOG_TAG, sSql);
    	database.execSQL(sSql);
    	theme = oQuestion.getQuestionTheme();
    	answers = oQuestion.getAnswers();
    	bool_isCorrect = oQuestion.getIsCorrectAnswers();

        for (i=0; i<answers.length; i++) {
        	if (bool_isCorrect [i] == true) {
        		boolSqlite = 1;
        	}
        	else {
        		boolSqlite = 0;
        	}
        	execSQL("INSERT INTO Answers (as_idQuestions, as_text, as_isCorrect) VALUES ((SELECT MAX(idQuestions) FROM Questions WHERE qst_text='" + oQuestion.getQuestionText() + "'), '" + answers[i] + "', " + boolSqlite +")");
        }
        try {
        	execSQL("INSERT INTO " + dbHelper.TABLE_THEMES_HAS_QUESTIONS + " (thq_idQuestions, thq_idThemes) VALUES ((SELECT MAX(idQuestions) FROM Questions WHERE qst_text='" + oQuestion.getQuestionText() + "'), (SELECT MAX(idThemes) FROM Themes WHERE th_title='" + theme + "'))"); 
        }
        catch (Exception e) {
        	execSQL("INSERT INTO " + dbHelper.TABLE_THEMES + "(th_title) VALUES ('" + oQuestion.getQuestionTheme() + "')");
        	execSQL("INSERT INTO " + dbHelper.TABLE_THEMES_HAS_QUESTIONS + " (thq_idQuestions, thq_idThemes) VALUES ((SELECT MAX(idQuestions) FROM Questions WHERE qst_text='" + oQuestion.getQuestionText() + "'), (SELECT MAX(idThemes) FROM Themes WHERE th_title='" + theme + "'))");
        }
    }
    
    public void logAllTypes() {
    	Cursor mCursor = database.rawQuery("SELECT * FROM QuestionType", null);
    	mCursor.moveToFirst();
    	Log.d(LOG_TAG, mCursor.getString(mCursor.getColumnIndex("qt_title")) + ", " +
    			mCursor.getString(mCursor.getColumnIndex("qt_explanation")));
    }
    
    public void logAllTablesOfDB(){
    	Cursor mCursor = database.rawQuery("SELECT tbl_name FROM sqlite_master WHERE type='table';", null);
    	mCursor.moveToFirst();
    	Log.d(LOG_TAG, "Alle Tabellen:");
    	while(!mCursor.isAfterLast()) {
    		Log.d(LOG_TAG, mCursor.getString(mCursor.getColumnIndex("tbl_name")));
    		mCursor.moveToNext();
    	}
    }
    
    public void logAllUserQuestionIDs() {
    	Cursor mCursor = database.rawQuery("SELECT uhq_idQuestions FROM PeatUser_has_Questions", null);
    	mCursor.moveToFirst();
    	Log.d(LOG_TAG, "Alle IDs von User_Fragen:");
    	while(!mCursor.isAfterLast()) {
    		Log.d(LOG_TAG, mCursor.getString(mCursor.getColumnIndex("uhq_idQuestions")));
    		mCursor.moveToNext();
    	}
    }
    
    public void logAllQuestionsOfDB() {
    	Cursor mCursor = database.rawQuery("SELECT * FROM Questions;", null);
    	mCursor.moveToFirst();
    	Log.d(LOG_TAG, "Alle Fragen:");
    	while(!mCursor.isAfterLast()) {
    		Log.d(LOG_TAG, mCursor.getString(mCursor.getColumnIndex("qst_text")) + "   " + mCursor.getString(mCursor.getColumnIndex("idQuestions")));
    		mCursor.moveToNext();
    	}
    }
    
    public void logAllQuestionsOfThemesofDB() {
    	Cursor mCursor = database.rawQuery("SELECT * FROM " + dbHelper.TABLE_THEMES_HAS_QUESTIONS, null);
    	mCursor.moveToFirst();
    	Log.d(LOG_TAG, "Alle Themenzuordnungen:");
    	while(!mCursor.isAfterLast()) {
    		Log.d(LOG_TAG, mCursor.getString(mCursor.getColumnIndex("thq_idQuestions")) + "   " + mCursor.getString(mCursor.getColumnIndex("thq_idThemes")));
    		mCursor.moveToNext();
    	}
    }
      
    public Question getNextQuestion(){
	    	Question oQuestion;
	    	String[] answersArray;
	    	Boolean[] isCorrectArray;
	    	answersArray = new String[0];
	    	isCorrectArray = new Boolean[0];
	    	Integer iIsCorrect;
	    	logAllUserQuestionIDs();
	    	Cursor mCursorQuestions = database.rawQuery("SELECT * FROM Questions JOIN QuestionType ON idQuestionType = qst_idQuestionType WHERE idQuestions NOT IN (SELECT uhq_idQuestions FROM PeatUser_has_Questions);", null);
	    	//Cursor mCursor = database.rawQuery("SELECT * FROM Questions JOIN QuestionType ON idQuestionType = qst_idQuestionType JOIN Answers ON idQuestions = as_idQuestions", null);
	    	mCursorQuestions.moveToFirst();
	    	String QuestionText = mCursorQuestions.getString(mCursorQuestions.getColumnIndex("qst_text"));
	    	String idQuestion = mCursorQuestions.getString(mCursorQuestions.getColumnIndex("idQuestions"));
	    	String QuestionTypeTitle = mCursorQuestions.getString(mCursorQuestions.getColumnIndex("qt_title"));
	    	
	    	database.execSQL("INSERT INTO PeatUser_has_Questions (uhq_idQuestions, uhq_isIgnore, uhq_idPeatUser) VALUES(" + idQuestion + ", 0, (SELECT MAX(idPeatUser) FROM PeatUser WHERE us_name = 'Steven'))");
	    	Cursor mCursorAnswers = database.rawQuery("SELECT * FROM Answers WHERE as_idQuestions = " + idQuestion, null);
	    	mCursorAnswers.moveToFirst();
	    	while(!mCursorAnswers.isAfterLast()) {
	    		String asText = mCursorAnswers.getString(mCursorAnswers.getColumnIndex("as_text"));
	    		answersArray = addStringToArray(answersArray, asText);
	    		iIsCorrect = mCursorAnswers.getInt(mCursorAnswers.getColumnIndex("as_isCorrect"));
	    		if (iIsCorrect == 1) {
					isCorrectArray = addBooleanToArray(isCorrectArray, true);
	    		}else {
	    			isCorrectArray = addBooleanToArray(isCorrectArray, false);
	    		}
	    		mCursorAnswers.moveToNext();
	    	}
	    	
	    	logAllQuestionsOfThemesofDB();
	    	Cursor mCursorThemes = database.rawQuery("SELECT * FROM " + dbHelper.TABLE_THEMES_HAS_QUESTIONS + " JOIN " + dbHelper.TABLE_THEMES + " ON idThemes = thq_idThemes WHERE thq_idQuestions = " + idQuestion, null);
	    	mCursorThemes.moveToFirst();
	    	String sTheme = mCursorThemes.getString(mCursorThemes.getColumnIndex("th_title"));
	    	oQuestion = new Question(sTheme, QuestionText, QuestionTypeTitle, answersArray, isCorrectArray);
	    	return oQuestion;
    }
    
    public String[] getAllThemes(){
    	String[] themeArray = new String[0];
    	String strThema;
       	Cursor mCursor = database.rawQuery("SELECT * FROM " + dbHelper.TABLE_THEMES + " ORDER BY th_title", null);
    	mCursor.moveToFirst();
    	Log.d(LOG_TAG, "Themen:");
    	while(!mCursor.isAfterLast()) {
    		strThema = mCursor.getString(mCursor.getColumnIndex("th_title"));
    		Log.d(LOG_TAG, strThema);
    		themeArray = addStringToArray(themeArray, strThema);
    		mCursor.moveToNext();
    	}
    	return themeArray;
    }
    
    private String[] addStringToArray(String[] array, String string){
    	Integer length = array.length;
    	String[] bufferArray = new String[length + 1];
    	Integer i = 0;
    	while (i < length) {
    		bufferArray[i] = array[i];
    		i++;
    	}
    	bufferArray[length] = string;
    	return bufferArray;
    }
    
    private Boolean[] addBooleanToArray(Boolean[] array, Boolean bool){
    	Integer length = array.length;
    	Boolean[] bufferArray = new Boolean[length + 1];
    	Integer i = 0;
    	while (i < length) {
    		bufferArray[i] = array[i];
    		i++;
    	}
    	bufferArray[length] = bool;
    	return bufferArray;
    }
    
    public Integer getIdFromQuestionTypeTitle(String title){
    	Cursor mCursor = database.rawQuery("SELECT * FROM QuestionType WHERE qt_title = '" + title +"'", null);
    	mCursor.moveToFirst();
    	return mCursor.getInt(mCursor.getColumnIndex("idQuestionType"));
    }
    
    public void resetUserHasQuestions() {
    	database.execSQL("DELETE FROM " + dbHelper.TABLE_PEATUSER_HAS_QUESTIONS);
    }

    public void close() {
    	dbHelper.close();
    	Log.d(LOG_TAG, "Datenbank mit Hilfe des DbHelpers geschlossen.");
    }
    
    private void execSQL(String sSQL) {
       	Log.d(LOG_TAG, sSQL);
    	database.execSQL(sSQL);
    }
}