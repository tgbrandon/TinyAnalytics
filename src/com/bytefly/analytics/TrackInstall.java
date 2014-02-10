package com.bytefly.analytics;

import android.app.Activity;
import android.util.Log;

import com.bytefly.analytics.util.Debug;
import com.bytefly.analytics.util.NetworkAsyncTask;

public class TrackInstall {

	public static void executeTrack(String appName,Activity act) {
		if (Debug.debugging) {
			Log.d(Debug.TAG, "executeTrack " + appName);
		}
		NetworkAsyncTask nat = new NetworkAsyncTask(act);
		nat.execute(appName);
	}
}
