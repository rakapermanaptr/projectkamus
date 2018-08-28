package com.example.rakapermanaputra.projectkamus;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.provider.BaseColumns;

public class AppPreference {

    Context context;
    SharedPreferences prefs;

    public AppPreference(Context context) {
        prefs = PreferenceManager.getDefaultSharedPreferences(context);
        this.context = context;
    }

    public void setFirstRun(Boolean input) {
        SharedPreferences.Editor editor = prefs.edit();
        String key = context.getResources().getString(R.string.first_run);
        editor.putBoolean(key, input);
        editor.commit();
    }

    public boolean getFirstRun() {
        String key = context.getResources().getString(R.string.first_run);
        return prefs.getBoolean(key, true);
    }

}
