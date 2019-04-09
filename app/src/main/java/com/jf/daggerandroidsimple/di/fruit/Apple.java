package com.jf.daggerandroidsimple.di.fruit;

import com.jf.daggerandroidsimple.LogX;

import javax.inject.Inject;

public class Apple extends Fruit{

    private Color color;

    @Inject
    public Apple(Color color) {
        LogX.d("Apple INIT");
        this.color = color;
    }

    public void print() {
        LogX.d("This is an  "+color.colorDis()+" apple");
    }
}
