package com.uos.notes.injector.module;

import android.content.Context;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;
import net.tsz.afinal.FinalDb.DaoConfig;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class AppModule_ProvideDaoConfigFactory implements Factory<DaoConfig> {
  private final AppModule module;
  private final Provider<Context> contextProvider;

  public AppModule_ProvideDaoConfigFactory(AppModule module, Provider<Context> contextProvider) {  
    assert module != null;
    this.module = module;
    assert contextProvider != null;
    this.contextProvider = contextProvider;
  }

  @Override
  public DaoConfig get() {  
    DaoConfig provided = module.provideDaoConfig(contextProvider.get());
    if (provided == null) {
      throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
    return provided;
  }

  public static Factory<DaoConfig> create(AppModule module, Provider<Context> contextProvider) {  
    return new AppModule_ProvideDaoConfigFactory(module, contextProvider);
  }
}

