package com.jf.daggerandroidsimple.di.vegetable;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Qualifier;

import dagger.Module;
import dagger.Provides;

@Module
public class VegetableModule {

    @Qualifier
    @Retention(RetentionPolicy.RUNTIME)
    public @interface ProvideTomato{}

    @Qualifier
    @Retention(RetentionPolicy.RUNTIME)
    public @interface ProvidePotato{}

    @Provides
    @ProvideTomato
    Vegetable provideTomato() {
        return new Tomato();
    }

    @Provides
    @ProvidePotato
    Vegetable providePotato() {
        return new Potato();
    }

}
