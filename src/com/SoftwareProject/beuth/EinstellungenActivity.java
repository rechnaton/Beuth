package com.SoftwareProject.beuth;

import android.annotation.TargetApi;
import android.os.Build;
import android.os.Bundle;
import android.preference.Preference;
import android.preference.PreferenceActivity;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.widget.Toast;

@TargetApi(Build.VERSION_CODES.HONEYCOMB)
public class EinstellungenActivity extends PreferenceActivity
        implements Preference.OnPreferenceChangeListener {
    
        	@Override
        	public void onCreate(Bundle savedInstanceState) {
        		super.onCreate(savedInstanceState);
        		
        		addPreferencesFromResource(R.xml.preferences);
 
        		Toast.makeText(this, "Einstellungen gestartet.", Toast.LENGTH_SHORT).show();
        		Toast.makeText(this, "Zurück mit Back-Button.", Toast.LENGTH_SHORT).show();
        		
        		Preference themenlistePref = findPreference(getString(R.string.themes_title));
        		themenlistePref.setOnPreferenceChangeListener(this);

        		// onPreferenceChange sofort aufrufen mit der in SharedPreferences gespeicherten Themenliste
        		SharedPreferences sharedPrefs = PreferenceManager.getDefaultSharedPreferences(this);
        		String gespeicherteThemenliste = sharedPrefs.getString(themenlistePref.getKey(), "");
        		onPreferenceChange(themenlistePref, gespeicherteThemenliste);
        		
        	}

        	@Override
        	public boolean onPreferenceChange(Preference preference, Object value) {
        		preference.setSummary(value.toString());
        	    return true;

        	}
}