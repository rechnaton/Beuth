package com.SoftwareProject.beuth;

import android.annotation.TargetApi;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.content.Intent;

@TargetApi(Build.VERSION_CODES.M)
public class LandingActivity extends AppCompatActivity {

	Button game; // Button game, ruft MainActivity auf
	Button question; // Button question, ruft Eingabe der Fragen auf
	Button theme; // Button theme, ruft user_themes auf
	Button setting; // Button setting, ruft Settings auf	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_landing);
	
		game = (Button) findViewById(R.id.game);
		question = (Button) findViewById(R.id.question);
		theme = (Button) findViewById(R.id.theme);
		setting = (Button) findViewById(R.id.setting);
		
		game.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(LandingActivity.this, MainActivity.class);
				LandingActivity.this.startActivity(intent);
			}
		});

		question.setOnClickListener(new View.OnClickListener() {
			
		 	@Override
		 	public void onClick(View v) {
		 		Intent intent = new Intent(LandingActivity.this, QuestionInputActivity.class);
		 		LandingActivity.this.startActivity(intent);
		 	}
		});
		
		theme.setOnClickListener(new View.OnClickListener() {
		 	
		 	@Override
		 	public void onClick(View v) {
		 		Intent intent = new Intent(LandingActivity.this, UserThemeActivity.class);
		 		LandingActivity.this.startActivity(intent);
		 	}
		});

		setting.setOnClickListener(new View.OnClickListener() {
		 	
		    @Override
		 	public void onClick(View v) {
		 		Intent intent = new Intent(LandingActivity.this, EinstellungenActivity.class);
				LandingActivity.this.startActivity(intent);
			}
		});
	}
	
}