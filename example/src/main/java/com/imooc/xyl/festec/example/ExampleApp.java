package com.imooc.xyl.festec.example;

import android.app.Application;

import com.imooc.xyl.latte.core.app.Latte;

public class ExampleApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Latte.init(this).withApiHost("http://192.168.7.168:80/").configure();
    }
}
