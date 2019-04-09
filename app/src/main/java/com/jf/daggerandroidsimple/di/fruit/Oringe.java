package com.jf.daggerandroidsimple.di.fruit;

import com.jf.daggerandroidsimple.LogX;

public class Oringe extends Fruit{

    public Oringe() {
        LogX.d("Oringe INIT");
    }

    @Override
    public void print() {
        LogX.d("This is an  Oringe");
    }
}
