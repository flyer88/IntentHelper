package com.dove.flyer.intenthelper;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import com.dove.flyer.intenthelper.core.IntentBuilder;
import com.dove.flyer.intenthelper.core.IntentHelper;
import com.dove.flyer.intenthelper.core.IntentParser;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent = new IntentBuilder()
                .putString("key","")
                .putInt("key",0)
                .putFloat("key",0.1f)
                .putDouble("key",0.1d)
                .buildIntent();
        IntentHelper intentHelper = new IntentBuilder()
                .putString("key","")
                .putInt("key",0)
                .putFloat("key",0.1f)
                .putDouble("key",0.1d)
                .buildHelper();
        intentHelper.startActivity(this);

        String value = new IntentParser(getIntent()).getBundle().getString("key");
    }
}
