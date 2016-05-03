package com.SoftwareProject.beuth;

import android.support.v7.app.AppCompatActivity;
import android.annotation.TargetApi;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
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
	
	Button quiz, buttonAnswer, pause, wiki;
	// Button score;
	TextView anzeige;
	String frageA;
	String antwortA;
	String hinweis;
	String gotowikipedia;
	
	private RadioGroup radioGroup;
	private RadioButton radioAnswerButton;
	// private Button buttonAnswer;
	  
	private static final int RESULT_SETTINGS = 1;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		frageA = " ";
		antwortA = " ";
		hinweis = " ";
		quiz = (Button) findViewById(R.id.quiz);
		// score = (Button) findViewById(R.id.score);
		buttonAnswer = (Button) findViewById(R.id.buttonAnswer);
		pause = (Button) findViewById(R.id.pause);
		anzeige = (TextView) findViewById(R.id.totaloutput);
		wiki = (Button) findViewById(R.id.wiki);
				
		quiz.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				frageA = "Ist der BVB der beste Club der Welt?";
				anzeige.setText("Frage: " + frageA);
				}
		});
		
		// score.setOnClickListener(new View.OnClickListener() {
		// score.setOnClickListener(new View.OnClickListener() {
		//			
		//	@Override
		//	public void onClick(View v) {
		//		// TODO Auto-generated method stub
		//		antwortA = "Ja lautet die Antwort! Gut gemacht!";
		//		anzeige.setText("Antwort: " + antwortA);
		//		}
		// });
		
		pause.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				hinweis = "Frage wurde für später gespeichert!";
				anzeige.setText("Achtung: " + hinweis);
				}
		});
		
		wiki.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				  Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.wikipedia.de/"));
				  startActivity(browserIntent);
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

    	buttonAnswer.setOnClickListener(new OnClickListener() {

    		@Override
    		public void onClick(View v) {

    		// get selected radio button from radioGroup
    		int selectedId = radioGroup.getCheckedRadioButtonId();

    		// find the radiobutton by returned id
    		radioAnswerButton = (RadioButton) findViewById(selectedId);

    		antwortA = "Ja lautet die Antwort! Gut gemacht!";
    		anzeige.setText("Antwort: " + antwortA);
    		
    		Toast.makeText(MainActivity.this,
    		radioAnswerButton.getText(), Toast.LENGTH_SHORT).show();

    		}

    	});

      }
 
}