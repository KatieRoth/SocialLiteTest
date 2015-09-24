package com.example.katie.sociallitetest;

import android.app.Application;

/**
 * Created by Wesley on 9/23/2015.
 */
public class Globals extends Application {
    private boolean haiku = false;

    public boolean getBool(){
        return this.haiku;
    }

    public void setBool(boolean b){
        this.haiku = b;
    }
}
