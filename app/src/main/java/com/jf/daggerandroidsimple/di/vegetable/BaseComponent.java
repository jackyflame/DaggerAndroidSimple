package com.jf.daggerandroidsimple.di.vegetable;

import dagger.Component;

@Component(modules = VegetableModule.class)
public interface BaseComponent {

    @VegetableModule.ProvideTomato
    Vegetable getTomato();

    @VegetableModule.ProvidePotato
    Vegetable getPotato();

}
