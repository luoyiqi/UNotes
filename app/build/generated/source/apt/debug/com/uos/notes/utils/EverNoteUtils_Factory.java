package com.uos.notes.utils;

import android.content.Context;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;
import net.tsz.afinal.FinalDb;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class EverNoteUtils_Factory implements Factory<EverNoteUtils> {
  private final Provider<Context> mContextProvider;
  private final Provider<ThreadExecutorPool> poolProvider;
  private final Provider<FinalDb> mFinalDbProvider;
  private final Provider<PreferenceUtils> mPreferenceUtilsProvider;

  public EverNoteUtils_Factory(Provider<Context> mContextProvider, Provider<ThreadExecutorPool> poolProvider, Provider<FinalDb> mFinalDbProvider, Provider<PreferenceUtils> mPreferenceUtilsProvider) {  
    assert mContextProvider != null;
    this.mContextProvider = mContextProvider;
    assert poolProvider != null;
    this.poolProvider = poolProvider;
    assert mFinalDbProvider != null;
    this.mFinalDbProvider = mFinalDbProvider;
    assert mPreferenceUtilsProvider != null;
    this.mPreferenceUtilsProvider = mPreferenceUtilsProvider;
  }

  @Override
  public EverNoteUtils get() {  
    return new EverNoteUtils(mContextProvider.get(), poolProvider.get(), mFinalDbProvider.get(), mPreferenceUtilsProvider.get());
  }

  public static Factory<EverNoteUtils> create(Provider<Context> mContextProvider, Provider<ThreadExecutorPool> poolProvider, Provider<FinalDb> mFinalDbProvider, Provider<PreferenceUtils> mPreferenceUtilsProvider) {  
    return new EverNoteUtils_Factory(mContextProvider, poolProvider, mFinalDbProvider, mPreferenceUtilsProvider);
  }
}

