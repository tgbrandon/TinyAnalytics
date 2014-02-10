package com.bytefly.analytics;

import android.util.Log;

import com.bytefly.analytics.util.Debug;
import com.bytefly.analytics.util.Version;

public class Init {

	public Init() {
		if (Debug.debugging) {
			Log.d(Debug.TAG, "Version " + Version.VERSION);
		}
	}

}
