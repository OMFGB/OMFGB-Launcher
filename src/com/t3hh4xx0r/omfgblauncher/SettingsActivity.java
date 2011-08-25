package com.t3hh4xx0r.omfgblauncher;

import android.os.Bundle;
import android.preference.PreferenceActivity;

public class SettingsActivity extends PreferenceActivity {
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    
        this.addPreferencesFromResource(R.xml.settings);
    }
}
