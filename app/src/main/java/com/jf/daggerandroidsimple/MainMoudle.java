package com.jf.daggerandroidsimple;

import com.jf.daggerandroidsimple.base.BaseActivityModule;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Qualifier;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

// 注意也要用抽象类和抽象方法
@Module(includes = BaseActivityModule.class)
public abstract class MainMoudle{

    // 这个方法必须返回接口或抽象类，比如Presenter，不能直接返回MainPresenter
    // 方法的参数就是这个方法返回的是注入的对象，类似@Provides修饰的方法返回的对象
    // 这里的MainPresenter会通过上述声明的构造器注入自动构建
    @Binds
    abstract Presenter mainPresenter(MainPresenter mainPresenter);

//    @Binds
//    abstract Activity activityContext(MainActivity mainActivity);

    @Qualifier
    @Retention(RetentionPolicy.RUNTIME)
    public @interface MainPresenterId{}

    @Qualifier
    @Retention(RetentionPolicy.RUNTIME)
    public @interface MainPresenterType{}

    @Provides
    @MainPresenterId
    static int getMainPresenterId() {  // 注意是静态方法
        return 100; // 这里就简单返回int值
    }

    @Provides
    @MainPresenterType
    static int getMainPresenterType() {
        return 200;
    }

//    @Named("Activity")
//    @Provides
//    static Context provideContext(MainActivity mainActivity) {
//        return mainActivity;
//    }

}
