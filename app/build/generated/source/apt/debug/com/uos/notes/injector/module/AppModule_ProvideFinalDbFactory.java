package com.uos.notes.injector.module;

import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;
import net.tsz.afinal.FinalDb;
import net.tsz.afinal.FinalDb.DaoConfig;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class AppModule_ProvideFinalDbFactory implements Factory<FinalDb> {
  private final AppModule module;
  private final Provider<DaoConfig> configProvider;

  public AppModule_ProvideFinalDbFactory(AppModule module, Provider<DaoConfig> configProvider) {  
    assert module != null;
    this.module = module;
    assert configProvider != null;
    this.configProvider = configProvider;
  }

  @Override
  public FinalDb get() {  
    FinalDb provided = module.provideFinalDb(configProvider.get());
    if (provided == null) {
      throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
    return provided;
  }

  public static Factory<FinalDb> create(AppModule module, Provider<DaoConfig> configProvider) {  
    return new AppModule_ProvideFinalDbFactory(module, configProvider);
  }
}

