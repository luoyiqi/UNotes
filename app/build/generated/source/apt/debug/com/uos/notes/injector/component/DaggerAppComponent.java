package com.uos.notes.injector.component;

import android.content.Context;
import com.uos.notes.App;
import com.uos.notes.injector.module.AppModule;
import com.uos.notes.injector.module.AppModule_ProvideActivityContextFactory;
import com.uos.notes.injector.module.AppModule_ProvideApplicationFactory;
import com.uos.notes.injector.module.AppModule_ProvideDaoConfigFactory;
import com.uos.notes.injector.module.AppModule_ProvideFinalDbFactory;
import dagger.internal.ScopedProvider;
import javax.annotation.Generated;
import javax.inject.Provider;
import net.tsz.afinal.FinalDb;
import net.tsz.afinal.FinalDb.DaoConfig;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class DaggerAppComponent implements AppComponent {
  private Provider<App> provideApplicationProvider;
  private Provider<Context> provideActivityContextProvider;
  private Provider<DaoConfig> provideDaoConfigProvider;
  private Provider<FinalDb> provideFinalDbProvider;

  private DaggerAppComponent(Builder builder) {  
    assert builder != null;
    initialize(builder);
  }

  public static Builder builder() {  
    return new Builder();
  }

  private void initialize(final Builder builder) {  
    this.provideApplicationProvider = ScopedProvider.create(AppModule_ProvideApplicationFactory.create(builder.appModule));
    this.provideActivityContextProvider = ScopedProvider.create(AppModule_ProvideActivityContextFactory.create(builder.appModule));
    this.provideDaoConfigProvider = ScopedProvider.create(AppModule_ProvideDaoConfigFactory.create(builder.appModule, provideActivityContextProvider));
    this.provideFinalDbProvider = ScopedProvider.create(AppModule_ProvideFinalDbFactory.create(builder.appModule, provideDaoConfigProvider));
  }

  @Override
  public App app() {  
    return provideApplicationProvider.get();
  }

  @Override
  public Context context() {  
    return provideActivityContextProvider.get();
  }

  @Override
  public FinalDb finalDb() {  
    return provideFinalDbProvider.get();
  }

  @Override
  public DaoConfig daoConfig() {  
    return provideDaoConfigProvider.get();
  }

  public static final class Builder {
    private AppModule appModule;
  
    private Builder() {  
    }
  
    public AppComponent build() {  
      if (appModule == null) {
        throw new IllegalStateException("appModule must be set");
      }
      return new DaggerAppComponent(this);
    }
  
    public Builder appModule(AppModule appModule) {  
      if (appModule == null) {
        throw new NullPointerException("appModule");
      }
      this.appModule = appModule;
      return this;
    }
  }
}

