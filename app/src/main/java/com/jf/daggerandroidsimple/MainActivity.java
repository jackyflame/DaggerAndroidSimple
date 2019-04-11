package com.jf.daggerandroidsimple;

import android.os.Bundle;

import com.jf.daggerandroidsimple.base.BaseActivity;

import javax.inject.Inject;

public class MainActivity extends BaseActivity {

    //@Inject
    //MainPresenter mainPresenter;
    @Inject
    Presenter mainPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainPresenter.print();
    }
}
