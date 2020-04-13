package com.example.myapplication.di.componet;


import com.example.myapplication.di.annotion.PerSingleIton;
import com.example.myapplication.mvp.model.RxOperateImpl;

import dagger.Component;

@PerSingleIton
@Component(dependencies = AppComponent.class)
public interface RxOperateComponent {
    void inject(RxOperateImpl rxOperate);


}
