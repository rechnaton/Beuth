package com.SoftwareProject.beuth;

import android.content.Context;
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

    public static final String TABLE_QUESTIONS = "Questions";
    public static final String TABLE_ANSWERS = "Answers";    
    public static final String TABLE_QUESTIONTYPE = "QuestionType";
    public static final String TABLE_THEMES = "Themes";
    public static final String TABLE_THEMES_HAS_QUESTIONS = "Themes_has_Questions";
    public static final String TABLE_PEATUSER = "PeatUser";
    public static final String TABLE_PEATUSER_HAS_QUESTIONS = "PeatUser_has_Questions";
    public static final String TABLE_PEATUSER_HAS_THEMES = "PeatUser_has_Themes";
    public static final String TABLE_HISTORIEREPLIES = "HistorieReplies";

  
    public static final String SQL_CREATE =
    	"CREATE TABLE " + TABLE_QUESTIONTYPE +
    	"(idQuestionType INTEGER   NOT NULL , title VARCHAR(255)   NOT NULL , explanation VARCHAR(255), PRIMARY KEY(idQuestionType));" +

		"CREATE TABLE " +TABLE_THEMES +
		"(idThemes INTEGER NOT NULL , title VARCHAR(255), explanation VARCHAR(255), PRIMARY KEY(idThemes));" +

		"CREATE TABLE " + TABLE_PEATUSER + 
		"(idPeatUser INTEGER NOT NULL, PRIMARY KEY(idPeatUser));" +

		"CREATE TABLE " + TABLE_QUESTIONS +
		"(idQuestions INTEGER NOT NULL, QuestionType_idQuestionType INTEGER NOT NULL, text VARCHAR(255) NOT NULL, PRIMARY KEY(idQuestions), " +
		"FOREIGN KEY(QuestionType_idQuestionType) REFERENCES QuestionType(idQuestionType));" +

		"CREATE INDEX Questions_FKIndex1 ON Questions (QuestionType_idQuestionType);" +
		"CREATE INDEX IFK_Rel_01 ON Questions (QuestionType_idQuestionType);" +

		"CREATE TABLE " + TABLE_ANSWERS + 
		"(idAnswers INTEGER NOT NULL, Questions_idQuestions INTEGER NOT NULL, text VARCHAR(255) NOT NULL, isCorrect BOOL NOT NULL," +
		"PRIMARY KEY(idAnswers), FOREIGN KEY(Questions_idQuestions) REFERENCES Questions(idQuestions));" +

		"CREATE INDEX Answers_FKIndex1 ON Answers (Questions_idQuestions);" +
		"CREATE INDEX IFK_Rel_04 ON Answers (Questions_idQuestions);" +

		"CREATE TABLE " + TABLE_THEMES_HAS_QUESTIONS +
		"(Themes_idThemes INTEGER NOT NULL, Questions_idQuestions INTEGER NOT NULL, PRIMARY KEY(Themes_idThemes, Questions_idQuestions)," +
		"FOREIGN KEY(Themes_idThemes) REFERENCES Themes(idThemes), FOREIGN KEY(Questions_idQuestions) REFERENCES Questions(idQuestions));" +

		"CREATE INDEX Themes_has_Questions_FKIndex1 ON Themes_has_Questions (Themes_idThemes);" +
		"CREATE INDEX Themes_has_Questions_FKIndex2 ON Themes_has_Questions (Questions_idQuestions);" +
		"CREATE INDEX IFK_Rel_02 ON Themes_has_Questions (Themes_idThemes);" +
		"CREATE INDEX IFK_Rel_03 ON Themes_has_Questions (Questions_idQuestions);" +

		"CREATE TABLE " + TABLE_PEATUSER_HAS_QUESTIONS + 
		"(PeatUser_idPeatUser INTEGER NOT NULL, Questions_idQuestions INTEGER NOT NULL , isIgnore BOOL NOT NULL, lastShown DATETIME, " +
		"isLastAnswerCorrect BOOL, " +
		"PRIMARY KEY(PeatUser_idPeatUser, Questions_idQuestions), FOREIGN KEY(PeatUser_idPeatUser)  REFERENCES PeatUser(idPeatUser), " +
		"FOREIGN KEY(Questions_idQuestions) REFERENCES Questions(idQuestions));" +

		"CREATE INDEX PeatUser_has_Questions_FKIndex1 ON PeatUser_has_Questions (PeatUser_idPeatUser);" +
		"CREATE INDEX PeatUser_has_Questions_FKIndex2 ON PeatUser_has_Questions (Questions_idQuestions);" +
		"CREATE INDEX IFK_Rel_07 ON PeatUser_has_Questions (PeatUser_idPeatUser);" +
		"CREATE INDEX IFK_Rel_08 ON PeatUser_has_Questions (Questions_idQuestions);" +

		"CREATE TABLE " + TABLE_PEATUSER_HAS_THEMES + 
		"(PeatUser_idPeatUser INTEGER NOT NULL, Themes_idThemes INTEGER NOT NULL, questionEveryMinutes INTEGER NOT NULL, " +
		"PRIMARY KEY(PeatUser_idPeatUser, Themes_idThemes), " +
		"FOREIGN KEY(PeatUser_idPeatUser) REFERENCES PeatUser(idPeatUser), FOREIGN KEY(Themes_idThemes) REFERENCES Themes(idThemes));" +

		"CREATE INDEX PeatUser_has_Themes_FKIndex1 ON PeatUser_has_Themes (PeatUser_idPeatUser);" +
		"CREATE INDEX PeatUser_has_Themes_FKIndex2 ON PeatUser_has_Themes (Themes_idThemes);" +
		"CREATE INDEX IFK_Rel_05 ON PeatUser_has_Themes (PeatUser_idPeatUser);" +
		"CREATE INDEX IFK_Rel_06 ON PeatUser_has_Themes (Themes_idThemes);" +

		"CREATE TABLE " + TABLE_HISTORIEREPLIES + 
		"(idHistorieReplies INTEGER NOT NULL, PeatUser_has_Questions_Questions_idQuestions INTEGER NOT NULL, " +
		"PeatUser_has_Questions_PeatUser_idPeatUser INTEGER NOT NULL, dateOfReply DATETIME NOT NULL," +
		"wasCorrectReply BOOL NOT NULL, "+
		"PRIMARY KEY(idHistorieReplies), FOREIGN KEY(PeatUser_has_Questions_PeatUser_idPeatUser, PeatUser_has_Questions_Questions_idQuestions) " +
		"REFERENCES PeatUser_has_Questions(PeatUser_idPeatUser, Questions_idQuestions));" +

    	"CREATE INDEX HistorieReplies_FKIndex1 ON HistorieReplies (PeatUser_has_Questions_PeatUser_idPeatUser, PeatUser_has_Questions_Questions_idQuestions);" +
    	"CREATE INDEX IFK_Rel_09 ON HistorieReplies (PeatUser_has_Questions_PeatUser_idPeatUser, PeatUser_has_Questions_Questions_idQuestions);;";


    public PeatDbHelper(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
        Log.d(LOG_TAG, "DbHelper hat die Datenbank: " + getDatabaseName() + " erzeugt.");
    }

    // Die onCreate-Methode wird nur aufgerufen, falls die Datenbank noch nicht existiert
    @Override
    public void onCreate(SQLiteDatabase db) {
        try {
            Log.d(LOG_TAG, "Die Tabelle wird mit SQL-Befehl: " + SQL_CREATE + " angelegt.");
            db.execSQL(SQL_CREATE);
        }
        catch (Exception ex) {
            Log.e(LOG_TAG, "Fehler beim Anlegen der Tabelle: " + ex.getMessage());
        }
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
