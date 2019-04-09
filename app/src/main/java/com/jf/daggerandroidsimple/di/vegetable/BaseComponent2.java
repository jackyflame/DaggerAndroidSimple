package com.jf.daggerandroidsimple.di.vegetable;

import dagger.Component;

//@Component(modules = VegetableModule.class)
public interface BaseComponent2 {

    MainActivityComponent2 plus();//这里加一个返回SubComponent的方法

}
