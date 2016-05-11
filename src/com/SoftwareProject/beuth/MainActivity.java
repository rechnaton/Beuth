package com.SoftwareProject.beuth;

import android.support.v7.app.AppCompatActivity;
import android.annotation.TargetApi;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.media.MediaPlayer;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;
import android.widget.TextView;
import android.preference.PreferenceManager;
import android.content.SharedPreferences;

@TargetApi(Build.VERSION_CODES.HONEYCOMB)
public class MainActivity extends AppCompatActivity {
	
	Button quiz, buttonAnswer, back, pause, weiter, wiki, google, close;
	TextView anzeige;
	int setNextQuestion=0;
    String[] question={
    		" ",
    		"Dient Git der Versionsverwaltung für Software?",
    		"Ist Slack ein webbasierter Instant-Messanger?",
    		"Ist Trello eine Projektmanagementsoftware?",
    		"Ist Android u.a. auch ein Betriebssystem?",
    		"Bedeutet APK Android Package File?"};
    // String frageA;
	// String frageB;
	// String frageC;	
	String antwortA;
	String antwortB;
	String hinweis;
	
	private RadioGroup radioGroup;
	private RadioButton radioAnswerButton;
	  
	private static final int RESULT_SETTINGS = 1;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		// frageA = "Dient Git der Versionsverwaltung für Software?";
		// frageB = "Ist Slack ein webbasierter Instant-Messanger?";
		// frageC = "Ist Trello eine Projektmanagementsoftware?";		
		antwortA = "Ja lautet die Antwort! Gut gemacht!";
		antwortB = "Die Antwort ist leider falsch!";
		hinweis = "Frage wurde für später gespeichert!";
		quiz = (Button) findViewById(R.id.quiz);
		buttonAnswer = (Button) findViewById(R.id.buttonAnswer);
		pause = (Button) findViewById(R.id.pause);
		back = (Button) findViewById(R.id.back);
		weiter = (Button) findViewById(R.id.weiter);
		anzeige = (TextView) findViewById(R.id.totaloutput);
		anzeige.setText(question[setNextQuestion]);
		wiki = (Button) findViewById(R.id.wiki);
		google = (Button) findViewById(R.id.google);
		close = (Button) findViewById(R.id.close);
		
		quiz.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				// anzeige.setText("Frage: " + frageA);
				anzeige.setText("Möchtest du beginnen? Klicke anschließend auf Weiter.");
				}
		});
		
		back.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				// anzeige.setText("Frage: " + frageA);
				if(setNextQuestion==0){
					setNextQuestion=5;
				}
				else
				{
					setNextQuestion--;
				}
				anzeige.setText(question[setNextQuestion]);
				}
		});
		
		pause.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				anzeige.setText("Achtung: " + hinweis);
				}
		});
		
		weiter.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				// anzeige.setText("Frage: " + frageB);
				setNextQuestion++;
				if(setNextQuestion == 6){
					setNextQuestion=0;
				}
				anzeige.setText(question[setNextQuestion]);
				}
		});
		
		wiki.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				  Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.wikipedia.de/"));
				  startActivity(browserIntent);
			}
		});
		
		google.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				  Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.de/"));
				  startActivity(browserIntent);
			}
		});
		
		close.setOnClickListener(new View.OnClickListener() {
		     
			@Override
		     public void onClick(View v) {
		        finish();
		     }
		});
		
		addListenerOnButton();
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
			startActivity(new Intent(this, EinstellungenActivity.class));
			return true;
		}
		
		switch (item.getItemId()) {
        
        case R.id.action_settings:
            Intent i = new Intent(this, EinstellungenActivity.class);
            startActivityForResult(i, RESULT_SETTINGS);
            break;
        }

		return super.onOptionsItemSelected(item);
	}
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
 
        switch (requestCode) {
        case RESULT_SETTINGS:
            showUserSettings();
            break;
        }
 
    }

    private void showUserSettings() {
        SharedPreferences sharedPrefs = PreferenceManager
                .getDefaultSharedPreferences(this);
 
        StringBuilder builder = new StringBuilder();
 
        builder.append("\n Benutzername: "
                + sharedPrefs.getString("prefUsername", "NULL"));
 
        builder.append("\n Bericht senden:"
                + sharedPrefs.getBoolean("prefSendReport", false));
 
        builder.append("\n Wiederholung: "
                + sharedPrefs.getString("prefSyncFrequency", "NULL"));
 
        TextView settingsTextView = (TextView) findViewById(R.id.textUserSettings);
 
        settingsTextView.setText(builder.toString());
    }
    
    public void addListenerOnButton() {

    	radioGroup = (RadioGroup) findViewById(R.id.radioQuestion);
    	buttonAnswer = (Button) findViewById(R.id.buttonAnswer);

    	final MediaPlayer mpButtonClick = MediaPlayer.create(this, R.raw.onclickyes);
    	
    	buttonAnswer.setOnClickListener(new OnClickListener() {

    		@Override
    		public void onClick(View v) {

    		// get selected radio button from radioGroup
    		int selectedId = radioGroup.getCheckedRadioButtonId();

    		// find the radiobutton by returned id
    		radioAnswerButton = (RadioButton) findViewById(selectedId);

            if(selectedId == R.id.radioYes){
    		anzeige.setText("Antwort: " + antwortA);
    		mpButtonClick.start();
    		
    		Toast.makeText(MainActivity.this,
    		radioAnswerButton.getText(), Toast.LENGTH_SHORT).show();
            }
            else if(selectedId == R.id.radioNo){
            anzeige.setText("Antwort: " + antwortB);
            
        	Toast.makeText(MainActivity.this,
        	radioAnswerButton.getText(), Toast.LENGTH_SHORT).show();
            }
            
    		}

    	});

      }
}