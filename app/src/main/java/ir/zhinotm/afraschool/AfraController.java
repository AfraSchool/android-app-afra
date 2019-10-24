package ir.zhinotm.afraschool;

import androidx.multidex.MultiDexApplication;

import ir.zhinotm.afraschool.util.MyPreferenceManager;
import uk.co.chrisjenx.calligraphy.CalligraphyConfig;

public class AfraController extends MultiDexApplication {

    private static AfraController mInstance;
    private MyPreferenceManager preferenceManager;

    @Override
    public void onCreate() {
        super.onCreate();
        mInstance = this;
        // Set Font
        CalligraphyConfig.initDefault(new CalligraphyConfig.Builder()
                .setDefaultFontPath("fonts/IRANSans.ttf")
                .setFontAttrId(R.attr.fontPath)
                .build()
        );
    }

    public static synchronized AfraController getInstance() {
        return mInstance;
    }

    public MyPreferenceManager getPrefManager() {
        if (preferenceManager == null) {
            preferenceManager = new MyPreferenceManager(this);
        }
        return preferenceManager;
    }
}
