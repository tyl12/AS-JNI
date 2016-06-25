package com.example.jniapplication;

import android.util.Log;

/**
 * Created by Administrator on 2016/6/25.
 */
public class HelloJni {
    public native String  stringFromJNI();
    //public native String  unimplementedStringFromJNI();
    static {
        Log.d("##@@##", "loglib");
        System.loadLibrary("HelloJni");
        Log.d("##@@##", "loglib done");
    }
}
