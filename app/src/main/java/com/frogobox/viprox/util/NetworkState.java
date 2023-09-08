package com.frogobox.viprox.util;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

import com.frogobox.viprox.BaseApplication;


public class NetworkState {

    public static boolean isOnline() {
        ConnectivityManager cm =
                (ConnectivityManager) BaseApplication.instance.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo netInfo = cm.getActiveNetworkInfo();
        return netInfo != null && netInfo.isConnectedOrConnecting();
    }
}
