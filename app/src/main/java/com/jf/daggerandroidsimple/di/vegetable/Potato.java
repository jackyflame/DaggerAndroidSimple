package com.jf.daggerandroidsimple.di.vegetable;

import com.jf.daggerandroidsimple.LogX;

public class Potato extends Vegetable {
    @Override
    public void print() {
        LogX.d("This is a potato");
    }
}
