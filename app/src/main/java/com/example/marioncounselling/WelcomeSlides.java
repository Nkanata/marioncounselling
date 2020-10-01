package com.example.marioncounselling;

import android.content.Context;
import android.content.SharedPreferences;

public class WelcomeSlides {

    private static SharedPreferences pref;
    private SharedPreferences.Editor editor;
    Context _context;

    private int PRIVATE_MODE = 0;

    private static final String PREF_NAME = "Guidance-welcome";

    private static final String IS_FIRST_TIME_LAUNCH = "IsFirstTimeLaunch";

    public WelcomeSlides(Context context) {
        this._context = context;
        pref = _context.getSharedPreferences(PREF_NAME, PRIVATE_MODE);
        editor = pref.edit();
    }

    public void setFirstTimeLaunch(boolean isFirstTime) {
        editor.putBoolean(IS_FIRST_TIME_LAUNCH, isFirstTime);
        editor.commit();
    }

    public static boolean isFirstTimeLaunch() {
        return pref.getBoolean(IS_FIRST_TIME_LAUNCH, true);
    }


}
