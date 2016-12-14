package com.hovernet.cordovawebview;

import android.os.Bundle;
import org.apache.cordova.DroidGap;


public class MainActivity extends DroidGap {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.init();
        super.clearCache();
        super.loadUrl("http://petrolmak.mine.nu:8080/apex/f?p=100");
    }

    public void onReceivedError( int errorCode, String description, String failingUrl)
    {
        super.loadUrl("file:///android_asset/www/noconnection.html");
        return;
    }

    @Override
    public void onBackPressed() {
        finish();
        return ;

    }
}
