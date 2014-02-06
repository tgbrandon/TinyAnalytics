package com.bytefly.analytics;

import android.app.Activity;

import com.bytefly.analytics.util.NetworkAsyncTask;

public class TrackInstall {

	public static void executeTrack(String appName,Activity act) {
		NetworkAsyncTask nat = new NetworkAsyncTask(act);
		nat.execute(appName);
	}
}
