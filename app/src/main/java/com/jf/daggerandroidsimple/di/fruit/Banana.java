package com.jf.daggerandroidsimple.di.fruit;

import com.jf.daggerandroidsimple.LogX;

public class Banana extends Fruit{

    public Banana() {
        LogX.d("Banana INIT");
    }

    @Override
    public void print() {
        LogX.d("This is an  Banana");
    }

}
