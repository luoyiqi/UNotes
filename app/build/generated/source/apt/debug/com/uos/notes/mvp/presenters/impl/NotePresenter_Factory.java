package com.uos.notes.mvp.presenters.impl;

import android.content.Context;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;
import net.tsz.afinal.FinalDb;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class NotePresenter_Factory implements Factory<NotePresenter> {
  private final Provider<Context> mContextProvider;
  private final Provider<FinalDb> mFinalDbProvider;

  public NotePresenter_Factory(Provider<Context> mContextProvider, Provider<FinalDb> mFinalDbProvider) {  
    assert mContextProvider != null;
    this.mContextProvider = mContextProvider;
    assert mFinalDbProvider != null;
    this.mFinalDbProvider = mFinalDbProvider;
  }

  @Override
  public NotePresenter get() {  
    return new NotePresenter(mContextProvider.get(), mFinalDbProvider.get());
  }

  public static Factory<NotePresenter> create(Provider<Context> mContextProvider, Provider<FinalDb> mFinalDbProvider) {  
    return new NotePresenter_Factory(mContextProvider, mFinalDbProvider);
  }
}

