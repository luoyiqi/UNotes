package com.uos.notes.injector.component;

import android.content.Context;

import com.uos.notes.App;
import com.uos.notes.injector.ContextLifeCycle;
import com.uos.notes.injector.module.AppModule;

import net.tsz.afinal.FinalDb;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by lgp on 2015/9/2.
 */
@Singleton
@Component(modules = AppModule.class)
public interface AppComponent {
    App app();
    @ContextLifeCycle("App") Context context();
    FinalDb finalDb();
    FinalDb.DaoConfig daoConfig();
}
