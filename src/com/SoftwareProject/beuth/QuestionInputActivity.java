package com.SoftwareProject.beuth;

import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.Toast;
import android.annotation.TargetApi;
import android.os.Build;
import android.os.Bundle;

@TargetApi(Build.VERSION_CODES.M)
public class QuestionInputActivity extends AppCompatActivity {
	
	Button addQuestionTypeOpen; // Button ruft Fragment
	Button addQuestionTypeClosed; // Button ruft Fragment
	Button addQuestionTypeSingleChoice; // Button ruft Fragment
	Button addQuestionTypeMultipleChoice; // Button ruft Fragment
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_question_input);
		
		
		Toast.makeText(this, "Zurück mit Back-Button.", Toast.LENGTH_SHORT).show();
	}
	
	// Hier muss dann der Code für die Eingabe der Fragen hin.
	
}