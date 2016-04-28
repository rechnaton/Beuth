package com.SoftwareProject.beuth;

import android.annotation.TargetApi;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

@TargetApi(Build.VERSION_CODES.HONEYCOMB)
public class Splash extends AppCompatActivity {

	MediaPlayer startSong;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.splash);
		startSong = MediaPlayer.create(Splash.this, R.raw.splashsound);
		startSong.start();
		Thread timer = new Thread() {
			public void run() {
				try {
					sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} finally {
					Intent further = new Intent("com.SoftwareProject.beuth.MAIN");
					startActivity(further);
				}
			}
			
			};
			timer.start();
	}
	
	@Override
	protected void onPause() {
		super.onPause();
		startSong.release();
		finish();
	}
}