package com.bytefly.analytics;

import com.bytefly.analytics.util.NetworkAsyncTask;

public class TrackInstall {

	static void executeTrack() {
		NetworkAsyncTask nat = new NetworkAsyncTask();
		nat.execute("");
	}
}
