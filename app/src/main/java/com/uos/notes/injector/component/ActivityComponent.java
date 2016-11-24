package com.uos.notes.injector.component;

import android.content.Context;

import com.uos.notes.injector.Activity;
import com.uos.notes.injector.ContextLifeCycle;
import com.uos.notes.injector.module.ActivityModule;
import com.uos.notes.ui.MainActivity;
import com.uos.notes.ui.NoteActivity;
import com.uos.notes.ui.SettingActivity;

import net.tsz.afinal.FinalDb;

import dagger.Component;

/**
 * Created by lgp on 2015/9/2.
 */
@Activity
@Component(dependencies = AppComponent.class, modules = {ActivityModule.class})
public interface ActivityComponent {
    void inject(MainActivity activity);
    void inject(NoteActivity activity);
    void inject(SettingActivity activity);
    android.app.Activity activity();
    FinalDb finalDb();
    @ContextLifeCycle("Activity") Context activityContext();
    @ContextLifeCycle("App") Context appContext();
}
