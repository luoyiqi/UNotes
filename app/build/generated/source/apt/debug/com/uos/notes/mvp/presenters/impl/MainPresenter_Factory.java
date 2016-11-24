package com.uos.notes.mvp.presenters.impl;

import android.content.Context;
import com.uos.notes.utils.EverNoteUtils;
import com.uos.notes.utils.ObservableUtils;
import com.uos.notes.utils.PreferenceUtils;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;
import net.tsz.afinal.FinalDb;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class MainPresenter_Factory implements Factory<MainPresenter> {
  private final Provider<Context> contextProvider;
  private final Provider<FinalDb> finalDbProvider;
  private final Provider<PreferenceUtils> preferenceUtilsProvider;
  private final Provider<ObservableUtils> mObservableUtilsProvider;
  private final Provider<EverNoteUtils> everNoteUtilsProvider;

  public MainPresenter_Factory(Provider<Context> contextProvider, Provider<FinalDb> finalDbProvider, Provider<PreferenceUtils> preferenceUtilsProvider, Provider<ObservableUtils> mObservableUtilsProvider, Provider<EverNoteUtils> everNoteUtilsProvider) {  
    assert contextProvider != null;
    this.contextProvider = contextProvider;
    assert finalDbProvider != null;
    this.finalDbProvider = finalDbProvider;
    assert preferenceUtilsProvider != null;
    this.preferenceUtilsProvider = preferenceUtilsProvider;
    assert mObservableUtilsProvider != null;
    this.mObservableUtilsProvider = mObservableUtilsProvider;
    assert everNoteUtilsProvider != null;
    this.everNoteUtilsProvider = everNoteUtilsProvider;
  }

  @Override
  public MainPresenter get() {  
    return new MainPresenter(contextProvider.get(), finalDbProvider.get(), preferenceUtilsProvider.get(), mObservableUtilsProvider.get(), everNoteUtilsProvider.get());
  }

  public static Factory<MainPresenter> create(Provider<Context> contextProvider, Provider<FinalDb> finalDbProvider, Provider<PreferenceUtils> preferenceUtilsProvider, Provider<ObservableUtils> mObservableUtilsProvider, Provider<EverNoteUtils> everNoteUtilsProvider) {  
    return new MainPresenter_Factory(contextProvider, finalDbProvider, preferenceUtilsProvider, mObservableUtilsProvider, everNoteUtilsProvider);
  }
}

