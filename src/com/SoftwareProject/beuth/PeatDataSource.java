package com.SoftwareProject.beuth;

import android.content.Context;
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
}

