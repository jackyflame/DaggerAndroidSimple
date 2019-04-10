package com.jf.daggerandroidsimple.di.base;

import android.app.Application;
import android.content.Context;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class AppModule {

    @Singleton
    @Named("Context")
    @Provides
    Context provideContext(Context application) {
        return application;
    }

    @Singleton
    @Named("Application")
    @Provides
    Application provideMyApp(Application application) {
        return application;
    }

}
