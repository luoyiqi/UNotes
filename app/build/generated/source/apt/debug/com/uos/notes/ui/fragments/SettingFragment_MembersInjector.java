package com.uos.notes.ui.fragments;

import android.preference.PreferenceFragment;
import com.uos.notes.mvp.presenters.impl.SettingPresenter;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class SettingFragment_MembersInjector implements MembersInjector<SettingFragment> {
  private final MembersInjector<PreferenceFragment> supertypeInjector;
  private final Provider<SettingPresenter> settingPresenterProvider;

  public SettingFragment_MembersInjector(MembersInjector<PreferenceFragment> supertypeInjector, Provider<SettingPresenter> settingPresenterProvider) {  
    assert supertypeInjector != null;
    this.supertypeInjector = supertypeInjector;
    assert settingPresenterProvider != null;
    this.settingPresenterProvider = settingPresenterProvider;
  }

  @Override
  public void injectMembers(SettingFragment instance) {  
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    supertypeInjector.injectMembers(instance);
    instance.settingPresenter = settingPresenterProvider.get();
  }

  public static MembersInjector<SettingFragment> create(MembersInjector<PreferenceFragment> supertypeInjector, Provider<SettingPresenter> settingPresenterProvider) {  
      return new SettingFragment_MembersInjector(supertypeInjector, settingPresenterProvider);
  }
}

