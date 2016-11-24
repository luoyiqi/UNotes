package com.uos.notes.injector.component;

import com.uos.notes.injector.Fragment;
import com.uos.notes.injector.module.FragmentModule;
import com.uos.notes.ui.fragments.SettingFragment;

import dagger.Component;

/**
 * Created by lgp on 2015/9/3.
 */
@Fragment
@Component(dependencies = {ActivityComponent.class}, modules = {FragmentModule.class})
public interface FragmentComponent {
    void inject(SettingFragment fragment);
}
