package com.dove.flyer.intenthelper.core;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by flyer on 2016/12/9.
 * 链式调用
 * 构造 Intent
 */
public class IntentBuilder {

    Intent mIntent;
    Bundle mBundle;

    public IntentBuilder(){
        mIntent = new Intent();
        mBundle = new Bundle();
    }



    public Intent buildIntent(){
        return this.mIntent;
    }

    public Bundle buildBundle(){
        return this.mBundle;
    }

    public IntentHelper buildHelper(){
        return new IntentHelper(mIntent);
    }


    /*************************************************************************************************
     **************************************************************************************************
     ************* 以下是 intent 的构造   ***************************************************************
     ************* 如果缺少方法，可以字节添加 *************************************************************
     **************************************************************************************************
     **************************************************************************************************
     **************************************************************************************************
     **************************************************************************************************
     **************************************************************************************************/


    public IntentBuilder setClass(Context packageContext, Class<?> cls){
        mIntent.setClass(packageContext,cls);
        return this;
    }

    public IntentBuilder setData(Uri data) {
        mIntent.setData(data);
        return this;
    }

    public IntentBuilder setAction(String action){
        mIntent.setAction(action);
        return this;
    }

    public IntentBuilder addFlat(int flags){
        mIntent.addFlags(flags);
        return this;
    }

    public IntentBuilder addCategory(String category){
        mIntent.addCategory(category);
        return this;
    }








    /*************************************************************************************************
     **************************************************************************************************
     ************* 以下是bundle 的构造     *************************************************************
     **************************************************************************************************
     **************************************************************************************************
     **************************************************************************************************
     **************************************************************************************************
     **************************************************************************************************/



    public IntentBuilder bundle(@Nullable Bundle bundle){
        mIntent.putExtras(bundle);
        return this;
    }

    public IntentBuilder putInt(@Nullable String key, int value) {
        this.mBundle.putInt(key,value);
        return this;
    }

    public IntentBuilder putLong(@Nullable String key, long value) {
        this.mBundle.putLong(key,value);
        return this;
    }

    public IntentBuilder putDouble(@Nullable String key, double value) {
        this.mBundle.putDouble(key,value);
        return this;
    }

    public IntentBuilder putString(@Nullable String key, @Nullable String value) {
        this.mBundle.putString(key,value);
        return this;
    }

    public IntentBuilder putBooleanArray(@Nullable String key, @Nullable boolean[] value) {
        this.mBundle.putBooleanArray(key,value);
        return this;
    }

    public IntentBuilder putIntArray(@Nullable String key, @Nullable int[] value) {
        this.mBundle.putIntArray(key,value);
        return this;
    }

    public IntentBuilder putLongArray(@Nullable String key, @Nullable long[] value) {
        this.mBundle.putLongArray(key,value);
        return this;
    }

    public IntentBuilder putDoubleArray(@Nullable String key, @Nullable double[] value) {
        this.mBundle.putDoubleArray(key,value);
        return this;
    }

    public IntentBuilder putStringArray(@Nullable String key, @Nullable String[] value) {
        this.mBundle.putStringArray(key,value);
        return this;
    }

    public IntentBuilder putBoolean(@Nullable String key, boolean value){
        this.mBundle.putBoolean(key,value);
        return this;
    }
    
    public IntentBuilder putByte(@Nullable String key, byte value) {
        this.mBundle.putByte(key, value);
        return this;
    }

    public IntentBuilder putChar(@Nullable String key, char value) {
        this.mBundle.putChar(key, value);
        return this;
    }
    
    public IntentBuilder putShort(@Nullable String key, short value) {
        this.mBundle.putShort(key, value);
        return this;
    }

    public IntentBuilder putFloat(@Nullable String key, float value) {
        this.mBundle.putFloat(key, value);
        return this;
    }

    public IntentBuilder putCharSequence(@Nullable String key, @Nullable CharSequence value) {
        this.mBundle.putCharSequence(key, value);
        return this;
    }

    public IntentBuilder putParcelable(@Nullable String key, @Nullable Parcelable value) {
        this.mBundle.putParcelable(key,value);
        return this;
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public IntentBuilder putSize(@Nullable String key, @Nullable Size value) {
        this.mBundle.putSize(key,value);
        return this;
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public IntentBuilder putSizeF(@Nullable String key, @Nullable SizeF value) {
        this.mBundle.putSizeF(key,value);
        return this;
    }

    public IntentBuilder putParcelableArray(@Nullable String key, @Nullable Parcelable[] value) {
        this.mBundle.putParcelableArray(key,value);
        return this;
    }

    public IntentBuilder putParcelableArrayList(@Nullable String key,
                                       @Nullable ArrayList<? extends Parcelable> value) {
        this.mBundle.putParcelableArrayList(key,value);
        return this;
    }

    public IntentBuilder putSparseParcelableArray(@Nullable String key,
                                         @Nullable SparseArray<? extends Parcelable> value) {
        this.mBundle.putSparseParcelableArray(key,value);
        return this;
    }

    public IntentBuilder putIntegerArrayList(@Nullable String key, @Nullable ArrayList<Integer> value) {
        this.mBundle.putIntegerArrayList(key, value);
        return this;
    }

    public IntentBuilder putStringArrayList(@Nullable String key, @Nullable ArrayList<String> value) {
        this.mBundle.putStringArrayList(key, value);
        return this;
    }
    
    public IntentBuilder putCharSequenceArrayList(@Nullable String key,
                                         @Nullable ArrayList<CharSequence> value) {
        this.mBundle.putCharSequenceArrayList(key, value);
        return this;
    }

    public IntentBuilder putSerializable(@Nullable String key, @Nullable Serializable value) {
        this.mBundle.putSerializable(key, value);
        return this;
    }

    public IntentBuilder putByteArray(@Nullable String key, @Nullable byte[] value) {
        this.mBundle.putByteArray(key, value);
        return this;
    }

    public IntentBuilder putShortArray(@Nullable String key, @Nullable short[] value) {
        this.mBundle.putShortArray(key, value);
        return this;
    }

    public IntentBuilder putCharArray(@Nullable String key, @Nullable char[] value) {
        this.mBundle.putCharArray(key, value);
        return this;
    }
    
    public IntentBuilder putFloatArray(@Nullable String key, @Nullable float[] value) {
        this.mBundle.putFloatArray(key, value);
        return this;
    }

    public IntentBuilder putCharSequenceArray(@Nullable String key, @Nullable CharSequence[] value) {
        this.mBundle.putCharSequenceArray(key, value);
        return this;
    }

    public IntentBuilder putBundle(@Nullable String key, @Nullable Bundle value) {
        this.mBundle.putBundle(key,value);
        return this;
    }

    public IntentBuilder putBinder(@Nullable String key, @Nullable IBinder value) {
        this.mBundle.putBinder(key,value);
        return this;
    }

}
