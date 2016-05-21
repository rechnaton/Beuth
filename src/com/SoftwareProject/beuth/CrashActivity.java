package com.SoftwareProject.beuth;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class CrashActivity extends AppCompatActivity {

TextView error;
@Override
protected void onCreate(Bundle savedInstanceState) {
super.onCreate(savedInstanceState);
Thread.setDefaultUncaughtExceptionHandler(new ExceptionHandler(this));
setContentView(R.layout.activity_main);
error = (TextView) findViewById(R.id.error);
error.setText(getIntent().getStringExtra("error"));
}
}