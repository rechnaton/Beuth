package com.SoftwareProject.beuth;

import android.support.v7.app.AppCompatActivity;
import android.annotation.TargetApi;
import android.os.Build;
import android.os.Bundle;

@TargetApi(Build.VERSION_CODES.M)
public class QuestionInputActivity extends AppCompatActivity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_question_input);
	}
	
	// Hier muss dann der Code für die Eingabe der Fragen hin.
	
}