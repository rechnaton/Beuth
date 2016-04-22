package com.SoftwareProject.beuth;

import android.support.v7.app.AppCompatActivity;
import android.annotation.TargetApi;
import android.os.Build;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


@TargetApi(Build.VERSION_CODES.HONEYCOMB)
public class MainActivity extends AppCompatActivity {
	
	Button quiz, score, pause;
	TextView anzeige;
	String frageA;
	String antwortA;
	String hinweis;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		frageA = " ";
		antwortA = " ";
		hinweis = " ";
		quiz = (Button) findViewById(R.id.quiz);
		score = (Button) findViewById(R.id.score);
		pause = (Button) findViewById(R.id.pause);
		anzeige = (TextView) findViewById(R.id.totaloutput);
				
		quiz.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				frageA = "Ist der BVB der beste Club der Welt?";
				anzeige.setText("Frage: " + frageA);
				}
		});
		
		score.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				antwortA = "Ja lautet die Antwort! Dein Punktestand ist: 1";
				anzeige.setText("Antwort: " + antwortA);
				}
		});
		
		pause.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				hinweis = "Wird für später gespeichert!";
				anzeige.setText("Achtung: " + hinweis);
				}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
