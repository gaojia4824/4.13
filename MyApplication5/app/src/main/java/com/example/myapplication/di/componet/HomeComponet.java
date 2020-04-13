package com.example.myapplication.di.componet;


import com.example.myapplication.di.annotion.PerSingleIton;
import com.example.myapplication.mvp.presenter.HomePresenter;

import dagger.Component;

@PerSingleIton
@Component(dependencies = AppComponent.class)
public interface HomeComponet {
    void inject(HomePresenter homePresenter);
}
