package com.t3hh4xx0r.omfgblauncher;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

public class Preferences {

    private static Preferences _Current = null;

    public static Preferences getInstance() {
        if (_Current == null)
            _Current = new Preferences();
        return _Current;
    }

    private SharedPreferences mPreferences = null;

    public void setContext(Context context) {
        if (context == null && mPreferences != null) {
            mPreferences = null;
        } else if (context != null) {
            mPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        }
    }

    static final String PREF_HOMESCREEN_ENDLESS_LOOP = "EndlessHomescreenLoop";
    static final String PREF_LAUNCHER_ORIENTATE = "LauncherOrientation";
    static final String PREF_WALLPAPER_SCROLLING = "WallpaperScrolling";

    public boolean getEndlessScrolling() {
        return mPreferences.getBoolean(PREF_HOMESCREEN_ENDLESS_LOOP, true);
    }
    
    public boolean getOrientate() {
        return mPreferences.getBoolean(PREF_LAUNCHER_ORIENTATE, true);
    }

    public boolean getWallpaperScrolling() {
        return mPreferences.getBoolean(PREF_WALLPAPER_SCROLLING, true);
    }
}
