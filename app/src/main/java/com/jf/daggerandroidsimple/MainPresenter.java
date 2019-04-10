package com.jf.daggerandroidsimple;

import android.app.Application;
import android.content.Context;

import javax.inject.Inject;

public class MainPresenter implements Presenter {

    private int id;
    private int type;

    @Inject
    public MainPresenter(@MainMoudle.MainPresenterId int id, @MainMoudle.MainPresenterType int type, Application context) {
        LogX.d("MainPresenter init：" + (context != null));
        this.id = id;
        this.type = type;
    }

    public void print() {
        LogX.d("This is MainPresenter id = " + id+ " type = " + type);
    }
}
