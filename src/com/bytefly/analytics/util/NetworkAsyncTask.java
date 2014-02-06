package com.bytefly.analytics.util;

import android.app.Activity;
import android.app.Dialog;
import android.os.AsyncTask;
import android.view.Gravity;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class NetworkAsyncTask extends AsyncTask<String, Integer, Long> {
	public Activity act = null;
	public String paramValue = "";
	AnalyticsHttpConnector wconnect = null;
	boolean res = false;
	Dialog dialog = null;

	@Override
	protected Long doInBackground(String... params) {
		wconnect = new AnalyticsHttpConnector();
		res = wconnect.executeHttpDoAction(act, paramValue);
		return null;
	}

	protected void onPostExecute(Long result) {
	}
}
