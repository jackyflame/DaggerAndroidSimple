package com.jf.daggerandroidsimple;

import com.jf.daggerandroidsimple.di.fruit.Fruit;

import javax.inject.Inject;
import javax.inject.Named;

public class MainPresenter implements Presenter {

    private int id;
    private int type;

//    @Inject
//    public MainPresenter(@MainMoudle.MainPresenterId int id, @MainMoudle.MainPresenterType int type, Application context) {
//        LogX.d("MainPresenter init：" + (context != null));
//        this.id = id;
//        this.type = type;
//    }

    @Inject
    public MainPresenter(@Named("Oringe") Fruit fruit) {
        LogX.d("MainPresenter init：" + (fruit != null));
        fruit.print();
    }

    public void print() {
        LogX.d("This is MainPresenter id = " + id+ " type = " + type);
    }
}
