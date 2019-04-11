package com.jf.daggerandroidsimple.di.base;

import android.app.Application;
import android.content.Context;

import com.jf.daggerandroidsimple.di.fruit.Fruit;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjectionModule;
import dagger.android.AndroidInjector;
import dagger.android.support.AndroidSupportInjectionModule;

@Singleton
@Component (modules = {
        AppModule.class,
        ActivityModule.class,  // 用于绑定项目中的Activity
        AndroidSupportInjectionModule.class,  // 用于绑定扩展的组件，如v4
        AndroidInjectionModule.class})  // 用于绑定普通的组件
public interface AppComponent extends AndroidInjector<MyApplication> {

    @Component.Builder
    interface Builder{
        @BindsInstance
        Builder application(Application application);
        AppComponent build();
    }

}
