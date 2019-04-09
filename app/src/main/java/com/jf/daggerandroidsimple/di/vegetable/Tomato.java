package com.jf.daggerandroidsimple.di.vegetable;

import com.jf.daggerandroidsimple.LogX;

public class Tomato extends Vegetable{
    @Override
    public void print() {
        LogX.d("This is a tomato");
    }
}
