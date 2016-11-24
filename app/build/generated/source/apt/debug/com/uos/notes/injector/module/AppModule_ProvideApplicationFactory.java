package com.uos.notes.injector.module;

import com.uos.notes.App;
import dagger.internal.Factory;
import javax.annotation.Generated;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class AppModule_ProvideApplicationFactory implements Factory<App> {
  private final AppModule module;

  public AppModule_ProvideApplicationFactory(AppModule module) {  
    assert module != null;
    this.module = module;
  }

  @Override
  public App get() {  
    App provided = module.provideApplication();
    if (provided == null) {
      throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
    return provided;
  }

  public static Factory<App> create(AppModule module) {  
    return new AppModule_ProvideApplicationFactory(module);
  }
}

