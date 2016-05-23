package com.SoftwareProject.beuth;

import android.support.v7.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.annotation.TargetApi;
import android.os.Build;

@TargetApi(Build.VERSION_CODES.M)
public class QuestionTypeActivity extends AppCompatActivity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_question_type);
		
		Button openQuestion = (Button) findViewById(R.id.addQuestionTypeOpen);
		Button closedQuestion = (Button) findViewById(R.id.addQuestionTypeClosed);
		Button singleChoiceQuestion = (Button) findViewById(R.id.addQuestionTypeSingleChoice);
		Button mulitpleChoiceQuestion = (Button) findViewById(R.id.addQuestionTypeMultipleChoice);
		
		openQuestion.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intentgame = new Intent(QuestionTypeActivity.this, QuestionTypeOpenActivity.class);
				QuestionTypeActivity.this.startActivity(intentgame);
			}
		});

		closedQuestion.setOnClickListener(new View.OnClickListener() {
			
		 	@Override
		 	public void onClick(View v) {
		 		Intent intentquest = new Intent(QuestionTypeActivity.this, QuestionTypeOpenActivity.class);
		 		QuestionTypeActivity.this.startActivity(intentquest);
		 	}
		});
		
		singleChoiceQuestion.setOnClickListener(new View.OnClickListener() {
		 	
		 	@Override
		 	public void onClick(View v) {
		 		Intent intenttheme = new Intent(QuestionTypeActivity.this, QuestionTypeOpenActivity.class);
		 		QuestionTypeActivity.this.startActivity(intenttheme);
		 	}
		});

		mulitpleChoiceQuestion.setOnClickListener(new View.OnClickListener() {
		 	
		    @Override
		 	public void onClick(View v) {
		 		Intent intentset = new Intent(QuestionTypeActivity.this, QuestionTypeOpenActivity.class);
		 		QuestionTypeActivity.this.startActivity(intentset);
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.question_type, menu);
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
