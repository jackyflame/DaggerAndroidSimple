package com.jf.daggerandroidsimple;

import javax.inject.Inject;

public class MainPresenter implements Presenter {

    private int id;
    private int type;

    @Inject
    public MainPresenter(@MainMoudle.MainPresenterId int id, @MainMoudle.MainPresenterType int type) {
        LogX.d("MainPresenter init");
        this.id = id;
        this.type = type;
    }

    public void print() {
        LogX.d("This is MainPresenter id = " + id+ " type = " + type);
    }
}
