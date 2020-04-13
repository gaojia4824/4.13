package com.example.myapplication.di.componet;

import android.content.SharedPreferences;

import com.example.myapplication.di.module.AppModule;
import com.example.myapplication.mvp.model.OkManagerModule;
import com.example.myapplication.mvp.model.api.ApiService;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;
import javax.inject.Singleton;

import dagger.Component;
import okhttp3.OkHttpClient;

@Singleton
@Component(modules = {AppModule.class, OkManagerModule.class})
public interface AppComponent {
    SharedPreferences provideSp();
    OkHttpClient provideOk();
    ApiService provideApiService();

}
