package com.mobapde.luigi.screenrecorder;

import android.app.Application;
import android.content.Context;
import android.content.Intent;

/**
 * Created by Luigi on 10/30/2017.
 */

public class RecordApplication extends Application {

    private static RecordApplication application;

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        application = this;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        // Start service
        startService(new Intent(this, RecordService.class));
    }

    public static RecordApplication getInstance () {
        return application;
    }
}
