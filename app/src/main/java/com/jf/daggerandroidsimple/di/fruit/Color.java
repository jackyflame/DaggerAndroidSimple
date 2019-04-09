package com.jf.daggerandroidsimple.di.fruit;

import com.jf.daggerandroidsimple.LogX;

import javax.inject.Inject;

public class Color {
    @Inject
    public Color() {
        LogX.d("Color INIT");
    }

    public String colorDis(){
        return "red";
    }
}
