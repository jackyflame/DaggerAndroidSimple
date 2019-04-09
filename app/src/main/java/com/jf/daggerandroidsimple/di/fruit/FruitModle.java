package com.jf.daggerandroidsimple.di.fruit;

import com.jf.daggerandroidsimple.LogX;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Named;
import javax.inject.Qualifier;

import dagger.Module;
import dagger.Provides;

@Module
public class FruitModle {

    @Provides
    @Named("Oringe")
    Fruit provideOringe(){
        LogX.d("provideOringe");
        return new Oringe();
    }

    @Provides
    @Named("Banana") //用@Named注解标注返回Banana的方法
    Fruit provideBanana() {
        LogX.d("provideBanana");
        return new Banana();
    }

    @Qualifier //定义Apple的注解
    @Retention(RetentionPolicy.RUNTIME)
    public @interface ProvideOringe{}

    @Qualifier //定义Banana的注解
    @Retention(RetentionPolicy.RUNTIME)
    public @interface ProvideBanana{}

    @Provides
    @ProvideOringe  //表示这个方法返回Apple
    Fruit provideOringe2(){
        LogX.d("provideOringe2");
        return new Oringe();
    }

    @Provides
    @ProvideBanana //表示这个方法返回Banana
    Fruit provideBanana2() {
        LogX.d("provideBanana2");
        return new Banana();
    }

}
