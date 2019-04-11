package com.jf.daggerandroidsimple.base;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class BaseActivityModule {

    @Binds
    abstract Activity activity(AppCompatActivity activity);

}
