package com.SoftwareProject.beuth;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

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
    	database.execSQL("INSERT INTO " + dbHelper.TABLE_QUESTIONS + " (QuestionType_idQuestionType,text) VALUES(" + getIdFromQuestionTypeTitle(oQuestion.getQuestionTypeTitle()) + 
    			", '" + oQuestion.getQuestionText() +"')");
    }
    
    public void putNewQuestionTypeInDB(String title, String explanation){
    	database.execSQL("INSERT INTO QuestionType (title,explanation) VALUES('" + title + 
    			"', '" + explanation +"')");
    	Cursor mCursor = database.rawQuery("SELECT * FROM QuestionType", null);
    	mCursor.moveToFirst();
    	Log.d(LOG_TAG, mCursor.getString(mCursor.getColumnIndex("title")) + ", " +
    			mCursor.getString(mCursor.getColumnIndex("explanation")));
    }
    
    public void getAllTablesOfDB(){
    	Cursor mCursor = database.rawQuery("SELECT tbl_name FROM sqlite_master WHERE type='table';", null);
    	mCursor.moveToFirst();
    	Log.d(LOG_TAG, "Alle Tabellen:");
    	while(!mCursor.isAfterLast()) {
    		Log.d(LOG_TAG, mCursor.getString(mCursor.getColumnIndex("tbl_name")));
    		mCursor.moveToNext();
    	}
    }
    
    public Question getQuestion(){
    	//TODO
    	
    	Question oQuestion;
    	String[] answersArray;
    	Boolean[] isCorrectArray;
    	answersArray = new String[1];
    	isCorrectArray = new Boolean[1];
    	String sIsCorrect;
    	Cursor mCursor = database.rawQuery("SELECT * FROM Questions JOIN QuestionType ON idQuestionType = QuestionType_idQuestionType JOIN Anwers ON idQuestions = Questions_idQuestions", null);
    	mCursor.moveToFirst();
    	String QuestionText = mCursor.getString(mCursor.getColumnIndex("QuestionText"));
    	String QuestionTypeTitle = mCursor.getString(mCursor.getColumnIndex("TypeTitle"));
    	Integer i=0;
    	while(!mCursor.isAfterLast()) {
    		answersArray[i] = mCursor.getString(mCursor.getColumnIndex("AnswerText"));
    		sIsCorrect = mCursor.getString(mCursor.getColumnIndex("isCorrect"));
    		if (sIsCorrect == "True") {
				isCorrectArray[i] = true;
    		}else {
    			isCorrectArray[i] = false;
    		}
    		mCursor.moveToNext();
    		i=i+1;
    	}
    	oQuestion = new Question(QuestionText, QuestionTypeTitle, answersArray, isCorrectArray);
    	return oQuestion;
    }
    
    private String[] addStringToArray(String[] array, String string){
    	//TODO
    	return array;
    }
    
    public Integer getIdFromQuestionTypeTitle(String title){
    	Cursor mCursor = database.rawQuery("SELECT * FROM QuestionType WHERE title = '" + title +"'", null);
    	mCursor.moveToFirst();
    	return mCursor.getInt(mCursor.getColumnIndex("idQuestionType"));
    }

    public void close() {
    	dbHelper.close();
    	Log.d(LOG_TAG, "Datenbank mit Hilfe des DbHelpers geschlossen.");
    }
}