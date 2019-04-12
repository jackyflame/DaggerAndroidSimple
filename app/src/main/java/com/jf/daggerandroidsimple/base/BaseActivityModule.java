package com.jf.daggerandroidsimple.base;

import android.content.Context;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

@Module
public abstract class BaseActivityModule {

    @Provides
    static String provideTag(){
        return "BaseActivityModule";
    }

    @Named("Activity")
    @Provides
    static Context provideContext(BaseActivity mainActivity) {
        return mainActivity;
    }

}
