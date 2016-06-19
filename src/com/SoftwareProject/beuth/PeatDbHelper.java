package com.SoftwareProject.beuth;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

/*Hilfsklasse mit deren Hilfe die SQLite-Datenbank erstellt wird
 * enthält weiterhin wichtige Konstanten
 * 		wie Tabellennamen,
 * 		Datenbankversion, 
 * 		oder Namen der Spalten 
 * */
public class PeatDbHelper extends SQLiteOpenHelper{

    private static final String LOG_TAG = PeatDbHelper.class.getSimpleName();

    public static final String DB_NAME = "peat.db";
    public static final int DB_VERSION = 1;

    public static final String TABLE_QUESTIONTYPE = "QuestionType";
    public static final String TABLE_THEMES = "Themes";
    public static final String TABLE_PEATUSER = "PeatUser";
    public static final String TABLE_QUESTIONS = "Questions";
    public static final String TABLE_ANSWERS = "Answers";    
    public static final String TABLE_THEMES_HAS_QUESTIONS = "Themes_has_Questions";
    public static final String TABLE_PEATUSER_HAS_QUESTIONS = "PeatUser_has_Questions";
    public static final String TABLE_PEATUSER_HAS_THEMES = "PeatUser_has_Themes";
    public static final String TABLE_HISTORIEREPLIES = "HistorieReplies";

    
  
    public static final String SQL_CREATE_QUESTIONTYPE =
    	"CREATE TABLE " + TABLE_QUESTIONTYPE +
    	"(idQuestionType INTEGER   NOT NULL , qt_title VARCHAR(255)   NOT NULL UNIQUE, qt_explanation VARCHAR(255), PRIMARY KEY(idQuestionType));";

	public static final String SQL_CREATE_THEMES =
		"CREATE TABLE " + TABLE_THEMES +
		"(idThemes INTEGER NOT NULL , th_title VARCHAR(255), th_explanation VARCHAR(255), PRIMARY KEY(idThemes));";

	public static final String SQL_CREATE_PEATUSER =
		"CREATE TABLE " + TABLE_PEATUSER + 
		"(idPeatUser INTEGER NOT NULL, us_name VARCHAR(255), PRIMARY KEY(idPeatUser));";

	public static final String SQL_CREATE_QUESTIONS =
		"CREATE TABLE " + TABLE_QUESTIONS +
		"(idQuestions INTEGER NOT NULL, qst_idQuestionType INTEGER NOT NULL, qst_text VARCHAR(255) NOT NULL, PRIMARY KEY(idQuestions), " +
		"FOREIGN KEY(qst_idQuestionType) REFERENCES QuestionType(idQuestionType));";

	public static final String SQL_CREATE_INDEX1 =
		"CREATE INDEX Questions_FKIndex1 ON Questions (qst_idQuestionType);" +
		"CREATE INDEX IFK_Rel_01 ON Questions (qst_idQuestionType);";

	public static final String SQL_CREATE_ANSWERS =
		"CREATE TABLE " + TABLE_ANSWERS + 
		"(idAnswers INTEGER NOT NULL, as_idQuestions INTEGER NOT NULL, as_text VARCHAR(255) NOT NULL, as_isCorrect BOOL NOT NULL," +
		"PRIMARY KEY(idAnswers), FOREIGN KEY(as_idQuestions) REFERENCES Questions(idQuestions));";

	public static final String SQL_CREATE_INDEX2 =
		"CREATE INDEX Answers_FKIndex1 ON Answers (as_idQuestions);" +
		"CREATE INDEX IFK_Rel_04 ON Answers (as_idQuestions);";

	public static final String SQL_CREATE_THEMES_HAS_QUESTIONS =
		"CREATE TABLE " + TABLE_THEMES_HAS_QUESTIONS +
		"(thq_idThemes INTEGER NOT NULL, thq_idQuestions INTEGER NOT NULL, PRIMARY KEY(thq_idThemes, thq_idQuestions)," +
		"FOREIGN KEY(thq_idThemes) REFERENCES Themes(idThemes), FOREIGN KEY(thq_idQuestions) REFERENCES Questions(idQuestions));";

	public static final String SQL_CREATE_INDEX3 =
		"CREATE INDEX Themes_has_Questions_FKIndex1 ON Themes_has_Questions (thq_idThemes);" +
		"CREATE INDEX Themes_has_Questions_FKIndex2 ON Themes_has_Questions (thq_idQuestions);" +
		"CREATE INDEX IFK_Rel_02 ON Themes_has_Questions (thq_idThemes);" +
		"CREATE INDEX IFK_Rel_03 ON Themes_has_Questions (thq_idQuestions);";

	public static final String SQL_CREATE_PEATUSER_HAS_QUESTIONS =
		"CREATE TABLE " + TABLE_PEATUSER_HAS_QUESTIONS + 
		//"(PeatUser_idPeatUser INTEGER NOT NULL, Questions_idQuestions INTEGER NOT NULL , isIgnore BOOL NOT NULL, lastShown DATETIME, " +
		"(uhq_idPeatUser INTEGER, uhq_idQuestions INTEGER NOT NULL , uhq_isIgnore BOOL NOT NULL, uhq_lastShown TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL, " +
		"uhq_isLastAnswerCorrect BOOL, " +
		"PRIMARY KEY(uhq_idPeatUser, uhq_idQuestions), FOREIGN KEY(uhq_idPeatUser)  REFERENCES PeatUser(idPeatUser), " +
		"FOREIGN KEY(uhq_idQuestions) REFERENCES Questions(idQuestions));";

	public static final String SQL_CREATE_INDEX4 =
		"CREATE INDEX PeatUser_has_Questions_FKIndex1 ON PeatUser_has_Questions (uhq_idPeatUser);" +
		"CREATE INDEX PeatUser_has_Questions_FKIndex2 ON PeatUser_has_Questions (uhq_idQuestions);" +
		"CREATE INDEX IFK_Rel_07 ON PeatUser_has_Questions (uhq_idPeatUser);" +
		"CREATE INDEX IFK_Rel_08 ON PeatUser_has_Questions (uhq_idQuestions);";

	public static final String SQL_CREATE_PEATUSER_HAS_THEMES =
		"CREATE TABLE " + TABLE_PEATUSER_HAS_THEMES + 
		"(uht_idPeatUser INTEGER NOT NULL, uht_idThemes INTEGER NOT NULL, uht_questionEveryMinutes INTEGER NOT NULL, " +
		"PRIMARY KEY(uht_idPeatUser, uht_idThemes), " +
		"FOREIGN KEY(uht_idPeatUser) REFERENCES PeatUser(idPeatUser), FOREIGN KEY(uht_idThemes) REFERENCES Themes(idThemes));";

	public static final String SQL_CREATE_INDEX5 =
		"CREATE INDEX PeatUser_has_Themes_FKIndex1 ON PeatUser_has_Themes (uht_idPeatUser);" +
		"CREATE INDEX PeatUser_has_Themes_FKIndex2 ON PeatUser_has_Themes (uht_idThemes);" +
		"CREATE INDEX IFK_Rel_05 ON PeatUser_has_Themes (uht_idPeatUser);" +
		"CREATE INDEX IFK_Rel_06 ON PeatUser_has_Themes (uht_idThemes);";

	public static final String SQL_CREATE_HISTORIEREPLIES =
		"CREATE TABLE " + TABLE_HISTORIEREPLIES + 
		"(idHistorieReplies INTEGER NOT NULL, his_uhq_idQuestions INTEGER NOT NULL, " +
		"his_uhq_idPeatUser INTEGER NOT NULL, his_dateOfReply DATETIME NOT NULL," +
		"his_wasCorrectReply BOOL NOT NULL, "+
		"PRIMARY KEY(idHistorieReplies), FOREIGN KEY(his_uhq_idPeatUser, his_uhq_idQuestions) " +
		"REFERENCES PeatUser_has_Questions(uhq_idPeatUser, uhq_idQuestions));";

	public static final String SQL_CREATE_INDEX6 =
    	"CREATE INDEX HistorieReplies_FKIndex1 ON HistorieReplies (his_uhq_idPeatUser, his_uhq_idQuestions);" +
    	"CREATE INDEX IFK_Rel_09 ON HistorieReplies (his_uhq_idPeatUser, his_uhq_idQuestions);";


    public PeatDbHelper(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
        Log.d(LOG_TAG, "DbHelper hat die Datenbank: " + getDatabaseName() + " erzeugt.");
    }

    // Die onCreate-Methode wird nur aufgerufen, falls die Datenbank noch nicht existiert
    @Override
    public void onCreate(SQLiteDatabase db) {
        try {
            CreateSQL(db, TABLE_QUESTIONTYPE, SQL_CREATE_QUESTIONTYPE);
            CreateSQL(db, TABLE_THEMES, SQL_CREATE_THEMES);
            CreateSQL(db, TABLE_PEATUSER, SQL_CREATE_PEATUSER);
            CreateSQL(db, TABLE_QUESTIONS, SQL_CREATE_QUESTIONS);
            CreateSQL(db, TABLE_ANSWERS, SQL_CREATE_ANSWERS);
            CreateSQL(db, TABLE_THEMES_HAS_QUESTIONS, SQL_CREATE_THEMES_HAS_QUESTIONS);
            CreateSQL(db, TABLE_PEATUSER_HAS_QUESTIONS, SQL_CREATE_PEATUSER_HAS_QUESTIONS);
            CreateSQL(db, TABLE_PEATUSER_HAS_THEMES, SQL_CREATE_PEATUSER_HAS_THEMES);
            CreateSQL(db, TABLE_HISTORIEREPLIES, SQL_CREATE_HISTORIEREPLIES);
            CreateSQL(db, "Index 1", SQL_CREATE_INDEX1);
            CreateSQL(db, "Index 2", SQL_CREATE_INDEX2);
            CreateSQL(db, "Index 3", SQL_CREATE_INDEX3);
            CreateSQL(db, "Index 4", SQL_CREATE_INDEX4);
            CreateSQL(db, "Index 5", SQL_CREATE_INDEX5);
            CreateSQL(db, "Index 6", SQL_CREATE_INDEX6);
            putNewQuestionTypeInDB("SimpleText", "Bitte geben Sie Ihre Antwort als Text ein. Achten Sie auf die Rechtschreibung.", db);
            putNewQuestionTypeInDB("MultipleChoice", "Bitte wählen Sie eine oder mehrere Antworten.", db);
            putNewQuestionTypeInDB("Choice", "Bitte wählen Sie die richtige Antwort.", db);
            String[] antwortFrageA = {"Ja", "Nein"};
    	    Boolean[] isCorrectFrageA = {true, false};
    	    Question frageA = new Question("Git", "Dient Git der Versionsverwaltung für Software?", "Choice", antwortFrageA, isCorrectFrageA);
    	    putQuestionInDB(frageA, db);
    	    frageA.putQuestionText("Ist Slack ein webbasierter Instant-Messanger?");
    	    putQuestionInDB(frageA, db);
    	    frageA.putQuestionText("Ist Trello eine Projektmanagementsoftware?");
    	    putQuestionInDB(frageA, db);
    	    frageA.putQuestionText("Ist Android u.a. auch ein Betriebssystem?");
    	    putQuestionInDB(frageA, db);
    	    frageA.putQuestionText("Bedeutet APK Android Package File?");
    	    putQuestionInDB(frageA, db);
    	    logAllTablesofDB(db);
    	    logAllQuestionsOfDB(db);
    	    logAllAnswersOfDB(db);
    	    db.execSQL("INSERT INTO Peatuser (us_name) VALUES('Steven')");
        }
        catch (Exception ex) {
            Log.e(LOG_TAG, "Fehler beim Anlegen der Tabelle: " + ex.getMessage());
        }
    }
    
    private void CreateSQL(SQLiteDatabase db, String tablename, String SQL_CREATE){
    	Log.d(LOG_TAG, "Die Tabelle " + tablename + " wird mit SQL-Befehl: " + SQL_CREATE + " angelegt.");
        db.execSQL(SQL_CREATE);
    }
    
    public void putNewQuestionTypeInDB(String title, String explanation, SQLiteDatabase db){
    	db.execSQL("INSERT INTO QuestionType (qt_title,qt_explanation) VALUES('" + title + 
    			"', '" + explanation +"')");
    }
    
    public void putQuestionInDB(Question oQuestion, SQLiteDatabase db) {
    	db.execSQL("INSERT INTO Questions (qst_idQuestionType, qst_text) VALUES((SELECT MAX(idQuestionType) FROM QuestionType WHERE qt_title ='" + oQuestion.getQuestionTypeTitle() +"'), '" + oQuestion.getQuestionText() +"')");
    	String[] answers;
    	Boolean[] bool_isCorrect;
    	Integer i;
    	Integer i_correct;
    	answers = oQuestion.getAnswers();
    	bool_isCorrect = oQuestion.getIsCorrectAnswers();
        for (i=0; i<answers.length; i++) {
        	if (bool_isCorrect[i] == true) {
        		i_correct = 1;
        	}
        	else {
        		i_correct = 0;
        	}
        	db.execSQL("INSERT INTO Answers (as_idQuestions, as_text, as_isCorrect) VALUES ((SELECT MAX(idQuestions) FROM Questions WHERE qst_text='" + oQuestion.getQuestionText() + "'), '" + answers[i] + "', " + i_correct + ")");
        }
    }
    
    public void logAllTablesofDB(SQLiteDatabase db){
    	Cursor mCursor = db.rawQuery("SELECT tbl_name FROM sqlite_master WHERE type='table';", null);
    	mCursor.moveToFirst();
    	Log.d(LOG_TAG, "Alle Tabellen:");
    	while(!mCursor.isAfterLast()) {
    		Log.d(LOG_TAG, mCursor.getString(mCursor.getColumnIndex("tbl_name")));
    		mCursor.moveToNext();
    	}
    }
    
    public void logAllQuestionsOfDB(SQLiteDatabase db) {
    	Cursor mCursor = db.rawQuery("SELECT * FROM Questions;", null);
    	mCursor.moveToFirst();
    	Log.d(LOG_TAG, "Alle Fragen:");
    	while(!mCursor.isAfterLast()) {
    		Log.d(LOG_TAG, mCursor.getString(mCursor.getColumnIndex("qst_text")) + "   " + mCursor.getString(mCursor.getColumnIndex("idQuestions")));
    		mCursor.moveToNext();
    	}
    }
    
    public void logAllAnswersOfDB(SQLiteDatabase db) {
    	Cursor mCursor = db.rawQuery("SELECT * FROM Answers;", null);
    	mCursor.moveToFirst();
    	Log.d(LOG_TAG, "Alle Antworten:");
    	while(!mCursor.isAfterLast()) {
    		Log.d(LOG_TAG, mCursor.getString(mCursor.getColumnIndex("as_text")));
    		mCursor.moveToNext();
    	}
    }
    
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
