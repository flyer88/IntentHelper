package com.dove.flyer.intenthelper.core;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

/**
 * Created by flyer on 2016/12/9.
 * 仅用作安全检查
 * 用来避开 mIntent 为空的情况
 */
public class IntentParser {

    private static final String TAG = IntentParser.class.getSimpleName();

    Intent mIntent;

    public IntentParser(Intent intent){
        if (intent == null){
            Log.e(TAG,"intent 为空");
            intent = new Intent();
        }
        this.mIntent = intent;
    }

    public Bundle getBundle(){
        if (mIntent == null){
            Log.e(TAG,"intent 为空");
            mIntent = new Intent();
        }
        if (mIntent.getExtras() != null){
            return mIntent.getExtras();
        }
        return new Bundle();
    }

}
