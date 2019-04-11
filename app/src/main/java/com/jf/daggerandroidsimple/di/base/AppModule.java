package com.jf.daggerandroidsimple.di.base;

import android.app.Application;

import com.jf.daggerandroidsimple.di.fruit.FruitModle;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module(includes = {FruitModle.class})
public class AppModule {

//    @Singleton
//    @Named("Context")
//    @Provides
//    Context provideContext(Context application) {
//        return application;
//    }

    @Singleton
    @Named("Application")
    @Provides
    Application provideMyApp(Application application) {
        return application;
    }

}
