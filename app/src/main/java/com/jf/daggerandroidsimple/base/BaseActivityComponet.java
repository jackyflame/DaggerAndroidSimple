package com.jf.daggerandroidsimple.base;

import dagger.Subcomponent;
import dagger.android.AndroidInjectionModule;
import dagger.android.AndroidInjector;

@Subcomponent(modules = {
        AndroidInjectionModule.class
})
public interface BaseActivityComponet extends AndroidInjector<BaseActivity> {

    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<BaseActivity>{}

//    @Subcomponent.Builder
//    interface Builder{
//        BaseActivityComponet build();
//    }

}
