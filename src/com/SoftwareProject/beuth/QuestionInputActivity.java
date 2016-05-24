package com.SoftwareProject.beuth;

import android.annotation.TargetApi;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.view.inputmethod.InputMethodManager;

@TargetApi(Build.VERSION_CODES.M)
public class QuestionInputActivity extends AppCompatActivity {
	
	String QuestionTypeTitle;
	String questionText;
	String[] answers;
	Boolean[] isCorrect;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_question_input);
		
		Button addQuestion = (Button) findViewById(R.id.saveQuestionTypeOpen);
		
		addQuestion.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
			    
				// Auslesen verstecktes Feld Fragetyp - für Prototyp erstmal hartcodiert
				QuestionTypeTitle = "Open";
				
				// Auslesen Textfeld Thema
				// ?
				
				// Auslesen Textfeld Frage
				EditText editQuestionTypeOpenTheme = (EditText) findViewById(R.id.editQuestionTypeOpenQuestion);
				// Eingabe in einen String umwandeln
				questionText = editQuestionTypeOpenTheme.getText().toString();
				// Prüfen, ob Feld leer ist
				if(TextUtils.isEmpty(questionText)) {
					editQuestionTypeOpenTheme.setError(getString(R.string.editText_errorMessage));
				    return;
				}
				// Textfeld leeren
				editQuestionTypeOpenTheme.setText("");
				
				// Auslesen Textfeld Antwort
				EditText editQuestionTypeOpenAnswer = (EditText) findViewById(R.id.editQuestionTypeOpenAnswer);
				// Eingabe in einen String umwandeln
				String answersTemp = editQuestionTypeOpenAnswer.getText().toString();
				answers[0]= answersTemp;
				// Prüfen, ob Feld leer ist
				if(TextUtils.isEmpty(answers[0])) {
					editQuestionTypeOpenAnswer.setError(getString(R.string.editText_errorMessage));
				    return;
				}
				// Textfeld leeren
				editQuestionTypeOpenAnswer.setText("");
				
				// Auslesen Textfeld isCorrect - für Prototyp erstmal hartcodiert
				isCorrect[0] = true;
				
				
			    // Speichern der ausgelesenen Werte in die SQLite Datenbank
				// 1. Question-Objekt erzeugen
				Question oQuestion = new Question(questionText, QuestionTypeTitle, answers, isCorrect);
				// 2. Speichermethode auf dem Question-Objekt aufrufen
				// putQuestionInDB(oQuestion);
				
			    // Aktualisieren der Anzeige
			}
		});
		
		Toast.makeText(this, "Zurück mit Back-Button.", Toast.LENGTH_SHORT).show();
	}
}