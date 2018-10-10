package com.imooc.xyl.latte.core.app;

import android.content.Context;

import java.util.WeakHashMap;

public final class Latte {

    public static Configurator init(Context ctx){
        getConfiguration().put(ConfigType.APPLICATION_CONTEXT.name(),ctx.getApplicationContext());
        return Configurator.getInstance();
    }

    private static WeakHashMap<String,Object> getConfiguration(){
        return Configurator.getInstance().getLatteConfig();
    }


}
