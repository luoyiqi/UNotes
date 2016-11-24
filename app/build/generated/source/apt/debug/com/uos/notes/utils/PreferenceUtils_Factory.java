package com.uos.notes.utils;

import android.content.Context;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class PreferenceUtils_Factory implements Factory<PreferenceUtils> {
  private final Provider<Context> contextProvider;

  public PreferenceUtils_Factory(Provider<Context> contextProvider) {  
    assert contextProvider != null;
    this.contextProvider = contextProvider;
  }

  @Override
  public PreferenceUtils get() {  
    return new PreferenceUtils(contextProvider.get());
  }

  public static Factory<PreferenceUtils> create(Provider<Context> contextProvider) {  
    return new PreferenceUtils_Factory(contextProvider);
  }
}

