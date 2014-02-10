package com.bytefly.analytics;

import android.app.Activity;
import android.util.Log;

import com.bytefly.analytics.util.Debug;
import com.bytefly.analytics.util.NetworkAsyncTask;
import com.bytefly.analytics.util.Version;

public class ByteFlyAnalytics {

	public static void init() {
		if (Debug.debugging) {
			Log.d(Debug.TAG, "Version " + Version.VERSION);
		}
	}
	
	public static void trackInstall(String appName,Activity act) {
		if (Debug.debugging) {
			Log.d(Debug.TAG, "trackInstall " + appName);
		}
		NetworkAsyncTask nat = new NetworkAsyncTask(act);
		nat.execute(appName);
	}

}
