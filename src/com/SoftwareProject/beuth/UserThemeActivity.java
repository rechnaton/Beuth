package com.SoftwareProject.beuth;

import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;
import android.annotation.TargetApi;
import android.os.Build;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;

@TargetApi(Build.VERSION_CODES.M)
public class UserThemeActivity extends AppCompatActivity {
	Button addTheme; // Button addTheme, fuegt neues Thema hinzu, ab Version v2.0.1
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.user_themes);
		
		addTheme = (Button) findViewById(R.id.addTheme);

		addTheme.setOnClickListener(new View.OnClickListener() {
					
			@Override
				public void onClick(View v) {
					// Hier erfolgt die Programmierung fuer die user_themes fuer die Version v2.0.1.
				
					Toast.makeText(UserThemeActivity.this, "Wende dich an den Support!", Toast.LENGTH_LONG).show();
		    	}
		});
		
		Toast.makeText(this, "Zurück mit Back-Button.", Toast.LENGTH_SHORT).show();
	}
}