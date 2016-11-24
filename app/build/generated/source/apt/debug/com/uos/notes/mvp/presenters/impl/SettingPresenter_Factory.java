package com.uos.notes.mvp.presenters.impl;

import android.content.Context;
import com.uos.notes.utils.EverNoteUtils;
import com.uos.notes.utils.FileUtils;
import com.uos.notes.utils.ObservableUtils;
import com.uos.notes.utils.PreferenceUtils;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;
import net.tsz.afinal.FinalDb;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class SettingPresenter_Factory implements Factory<SettingPresenter> {
  private final Provider<Context> mContextProvider;
  private final Provider<FinalDb> mFinalDbProvider;
  private final Provider<EverNoteUtils> mEverNoteUtilsProvider;
  private final Provider<PreferenceUtils> mPreferenceUtilsProvider;
  private final Provider<ObservableUtils> mObservableUtilsProvider;
  private final Provider<FileUtils> mFileUtilsProvider;

  public SettingPresenter_Factory(Provider<Context> mContextProvider, Provider<FinalDb> mFinalDbProvider, Provider<EverNoteUtils> mEverNoteUtilsProvider, Provider<PreferenceUtils> mPreferenceUtilsProvider, Provider<ObservableUtils> mObservableUtilsProvider, Provider<FileUtils> mFileUtilsProvider) {  
    assert mContextProvider != null;
    this.mContextProvider = mContextProvider;
    assert mFinalDbProvider != null;
    this.mFinalDbProvider = mFinalDbProvider;
    assert mEverNoteUtilsProvider != null;
    this.mEverNoteUtilsProvider = mEverNoteUtilsProvider;
    assert mPreferenceUtilsProvider != null;
    this.mPreferenceUtilsProvider = mPreferenceUtilsProvider;
    assert mObservableUtilsProvider != null;
    this.mObservableUtilsProvider = mObservableUtilsProvider;
    assert mFileUtilsProvider != null;
    this.mFileUtilsProvider = mFileUtilsProvider;
  }

  @Override
  public SettingPresenter get() {  
    return new SettingPresenter(mContextProvider.get(), mFinalDbProvider.get(), mEverNoteUtilsProvider.get(), mPreferenceUtilsProvider.get(), mObservableUtilsProvider.get(), mFileUtilsProvider.get());
  }

  public static Factory<SettingPresenter> create(Provider<Context> mContextProvider, Provider<FinalDb> mFinalDbProvider, Provider<EverNoteUtils> mEverNoteUtilsProvider, Provider<PreferenceUtils> mPreferenceUtilsProvider, Provider<ObservableUtils> mObservableUtilsProvider, Provider<FileUtils> mFileUtilsProvider) {  
    return new SettingPresenter_Factory(mContextProvider, mFinalDbProvider, mEverNoteUtilsProvider, mPreferenceUtilsProvider, mObservableUtilsProvider, mFileUtilsProvider);
  }
}

