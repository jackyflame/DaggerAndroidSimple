package com.jf.daggerandroidsimple.di.base;

import com.jf.daggerandroidsimple.MainActivity;
import com.jf.daggerandroidsimple.MainMoudle;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module(subcomponents = {})
public abstract class ActivityManageModule {


    @ContributesAndroidInjector(modules = {MainMoudle.class})
    abstract MainActivity mainActivity();// 绑定MainActivity

}