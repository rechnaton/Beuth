package com.SoftwareProject.beuth;

import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.Toast;
import android.annotation.TargetApi;
import android.os.Build;
import android.os.Bundle;

@TargetApi(Build.VERSION_CODES.M)
public class UnderConstructionActivity extends AppCompatActivity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_under_construction);
		
		ImageView iv = (ImageView)findViewById(R.id.underconstruction);
		iv.setImageResource(R.drawable.underconstruction);
		
		Toast.makeText(this, "Zurück mit Back-Button.", Toast.LENGTH_SHORT).show();
	}
	
	// Hier muss dann der Code für die anderen Fragetypen hin.
	
}