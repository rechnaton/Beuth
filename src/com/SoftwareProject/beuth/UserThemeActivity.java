package com.SoftwareProject.beuth;

import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;
import android.annotation.TargetApi;
import android.os.Build;
import android.os.Bundle;

@TargetApi(Build.VERSION_CODES.M)
public class UserThemeActivity extends AppCompatActivity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.user_themes);
		
		Toast.makeText(this, "Zurück mit Back-Button.", Toast.LENGTH_SHORT).show();
	}
	
	// Hier muss dann der Code für die user_themes hin.
}