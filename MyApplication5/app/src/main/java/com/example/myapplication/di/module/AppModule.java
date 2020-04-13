package com.example.myapplication.di.module;

import android.content.Context;
import android.content.SharedPreferences;

import com.example.myapplication.app.App;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class AppModule {
    private App app;

    public AppModule(App app) {
        this.app = app;
    }

    @Provides
    @Singleton
    public SharedPreferences provideSp() {

        return app.getSharedPreferences("config", Context.MODE_PRIVATE);
    }
}

