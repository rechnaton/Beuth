package com.SoftwareProject.beuth;

import android.support.v7.app.AppCompatActivity;
import android.util.Log;
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

@TargetApi(Build.VERSION_CODES.M)
public class MainActivity extends AppCompatActivity {
	/**
	 * Definition aller notwendigen Variablen
	 */
	Button start; // Button Frage, leitet das Spiel ein
	Button buttonAnswer; // Button Antwort, ruft die Antwort zur aktuellen Frage auf
	Button back; // Button #Repeat, ruft die zurueckliegende Frage auf
	Button pause; // Button Pause, speichert/pausiert die aktuelle Frage
	Button next; // Button Weiter, fuft die naechste Frage auf
	Button wiki; // Button Wiki, ruft die URL https://www.wikipedia.de/ auf
	Button google; // Button Google, ruft die URL https://www.google.de/ auf
	Button close; // Button Close, schliesst die Anwendung bzw. die App
	Button returnlanding; // Button return, ruft LandingActivity auf
	
	TextView stage; // Ausgabe, Mensch-Computer-Kommunikation
	
	public static final String LOG_TAG = MainActivity.class.getSimpleName();
	private PeatDataSource dataSource;
	
	String questionTypeTitle;
	String questionText;
	String[] answers;
	Boolean[] isCorrect;

	int setNextQuestion=0; // Zaehler-Mockup, setzt den Array-Index des Fragearrays auf 0
    String[] question={ // Fragen-Mockup als Array
    		" ",
    		"Dient Git der Versionsverwaltung für Software?",
    		"Ist Slack ein webbasierter Instant-Messanger?",
    		"Ist Trello eine Projektmanagementsoftware?",
    		"Ist Android u.a. auch ein Betriebssystem?",
    		"Bedeutet APK Android Package File?"};
	
    // Antwort-Mockup, Radio-Buttons Ja Nein
    String answerA = "Ja lautet die Antwort! Gut gemacht!";
	String answerB = "Die Antwort ist leider falsch!";
	
	// Hinweis, wenn Button-Pause geklickt wird
	String messagePause = "Frage wurde für später gespeichert!";
	
	// Definition einer Radio-Button-Gruppe für geschlossene Fragen (Ja-Nein-Fragen)
	private RadioGroup radioGroup;
	private RadioButton radioAnswerButton;
	
	// Variable für Einstellungen der App
	private static final int RESULT_SETTINGS = 1;
		
	/**
	 * Diese Klasse holt sich die Werte der einzelnen Buttons aus strings.xml und activity_main.xml
	 */
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		//try {
		super.onCreate(savedInstanceState);
		Thread.setDefaultUncaughtExceptionHandler(new ExceptionHandler(this)); 
		setContentView(R.layout.activity_main);

	    dataSource = new PeatDataSource(this);
	    Log.d(LOG_TAG, "Die Datenquelle wird geöffnet.");
	    
	    dataSource.open();
	    //this.deleteDatabase("peat.db");
	    //dataSource.putNewQuestionTypeInDB("SimpleText", "Bitte geben Sie Ihre Antwort als Text ein. Achten Sie auf die Rechtschreibung.");
	    //dataSource.getAllTablesOfDB();
	    String[] antwortFrageA = {"Ja"};
	    Boolean[] isCorrectFrageA = {true};
	    Question frageA = new Question("Wurde diese Frage in die DB gepackt?", "SimpleText", antwortFrageA, isCorrectFrageA);
	    dataSource.putQuestionInDB(frageA);
	    
		start = (Button) findViewById(R.id.start);
		
		stage = (TextView) findViewById(R.id.stage);
		stage.setText(question[setNextQuestion]);
		
		buttonAnswer = (Button) findViewById(R.id.buttonAnswer);
		
		back = (Button) findViewById(R.id.back);
		pause = (Button) findViewById(R.id.pause);
		next = (Button) findViewById(R.id.next);

		wiki = (Button) findViewById(R.id.wiki);
		google = (Button) findViewById(R.id.google);
		close = (Button) findViewById(R.id.close);
		
		returnlanding = (Button) findViewById(R.id.returnlanding);
		
		start.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				stage.setText("Möchtest du beginnen? Klicke einfach auf Weiter.");
			}
		});
		
		back.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				if(setNextQuestion == 1){
					setNextQuestion = 5;
				} else {
					setNextQuestion--;
				}
				stage.setText(question[setNextQuestion]);
			}
		});
		
		pause.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				stage.setText("Achtung: " + messagePause);
			}
		});
		
		next.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				setNextQuestion++;
				if(setNextQuestion == 6){
					setNextQuestion = 1;
				}
				stage.setText(question[setNextQuestion]);
			}
			
			// Auslesen der Fragen aus der SQLite Datenbank  
			// 1. Question-Objekt erzeugen  
			// Question oQuestion = new Question(questionText, questionTypeTitle, answers, isCorrect);  
			// 2. Fragen via Question-Objekt abrufen  
			// getQuestion (oQuestion);  

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
		
		returnlanding.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intentreturn = new Intent(MainActivity.this, LandingActivity.class);
				MainActivity.this.startActivity(intentreturn);
			}
		});
		
		addListenerOnButton();
		// } catch (Exception e) {
			// System.out.println(e.toString());
			// Toast.makeText(this, e.toString(), Toast.LENGTH_LONG).show();
		//	Toast.makeText(getApplicationContext(), e.getLocalizedMessage(), Toast.LENGTH_LONG).show(); 
		// }
	}

	/**
	 * Diese Klasse oeffnet das Menue, bzw. fuegt Menuepunkte hinzu, sofern diese existieren
	 */	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	/**
	 * Die folgenden 3 Klassen erstellen das Einstellungsmenue
	 * und holen Daten aus EinstellungenMain.java, strings.xml, preferences.xml und arrays.xml
	 */
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
			SharedPreferences sharedPrefs = PreferenceManager.getDefaultSharedPreferences(this);
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
    
	/**
	 * Diese Klasse prueft, welcher Radio-Button ausgewaehlt wurde
	 * und erzeugt je nach Wahl bei Klick auf Button Antwort
	 * einen Sound und einen Toast
	 */
    public void addListenerOnButton() {

    	radioGroup = (RadioGroup) findViewById(R.id.radioQuestion);
    	buttonAnswer = (Button) findViewById(R.id.buttonAnswer);

    	final MediaPlayer mpButtonClickYes = MediaPlayer.create(this, R.raw.onclickyes);
    	final MediaPlayer mpButtonClickNo = MediaPlayer.create(this, R.raw.onclickno);
    	
    	buttonAnswer.setOnClickListener(new OnClickListener() {

    		@Override
    		public void onClick(View v) {

    		// get selected radio button from radioGroup
    		int selectedId = radioGroup.getCheckedRadioButtonId();

    		// find the radiobutton by returned id
    		radioAnswerButton = (RadioButton) findViewById(selectedId);

            	if(selectedId == R.id.radioYes){
            		stage.setText("Antwort: " + answerA);
            		mpButtonClickYes.start();
            		Toast.makeText(MainActivity.this, radioAnswerButton.getText(), Toast.LENGTH_SHORT).show();
            	}
            	
            	else if(selectedId == R.id.radioNo){
            		stage.setText("Antwort: " + answerB);
            		mpButtonClickNo.start();
                   	Toast.makeText(MainActivity.this, radioAnswerButton.getText(), Toast.LENGTH_SHORT).show();
            	}
           }
    	});
      }
}