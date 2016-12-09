package com.dove.flyer.intenthelper.core;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;

/**
 * Created by flyer on 2016/12/9.
 * 常见的使用 Intent
 * 链式使用
 *
 * 配合 IntentBuilder 使用
 *
 */

public class IntentHelper {

    Intent mIntent;

    IntentHelper(Intent intent){
        this.mIntent = intent;
    }


    public void startActivity(Activity activity){
        activity.startActivity(mIntent);
    }

    public void startActivityForResult(Activity activity, int code){
        activity.startActivityForResult(mIntent,code);
    }

    public void startService(Context context){
        context.startService(mIntent);
    }

    public void stopService(Context context){
        context.stopService(mIntent);
    }

    public void sendBroadCast(Context context){
        context.sendBroadcast(mIntent);
    }


}
