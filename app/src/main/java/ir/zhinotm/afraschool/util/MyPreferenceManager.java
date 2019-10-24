package ir.zhinotm.afraschool.util;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;

public class MyPreferenceManager {

    private String TAG = MyPreferenceManager.class.getSimpleName();

    // Shared Preferences
    SharedPreferences pref;

    // Editor for Shared preferences
    SharedPreferences.Editor editor;

    // Context
    Context _context;

    int PRIVATE_MODE = 0;

    private static final String PREF_NAME = "afra";

    private static final String KEY_USER_TOKEN = "user_id";
    private static final String KEY_USER_FULLNAME = "user_name";
    private static final String KEY_USER_EMAIL = "user_email";

    @SuppressLint("CommitPrefEdits")
    public MyPreferenceManager(Context context) {
        this._context = context;
        pref = _context.getSharedPreferences(PREF_NAME, PRIVATE_MODE);
        editor = pref.edit();
    }


    public void clear() {
        editor.clear();
        editor.commit();
    }
}
