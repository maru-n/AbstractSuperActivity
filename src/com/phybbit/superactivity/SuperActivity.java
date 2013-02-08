package com.phybbit.superactivity;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public abstract class SuperActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.initActivity();
    }
	public abstract void initActivity();
}
