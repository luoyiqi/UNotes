package com.uos.notes.ui;

import com.uos.notes.mvp.presenters.impl.MainPresenter;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class MainActivity_MembersInjector implements MembersInjector<MainActivity> {
  private final MembersInjector<BaseActivity> supertypeInjector;
  private final Provider<MainPresenter> mainPresenterProvider;

  public MainActivity_MembersInjector(MembersInjector<BaseActivity> supertypeInjector, Provider<MainPresenter> mainPresenterProvider) {  
    assert supertypeInjector != null;
    this.supertypeInjector = supertypeInjector;
    assert mainPresenterProvider != null;
    this.mainPresenterProvider = mainPresenterProvider;
  }

  @Override
  public void injectMembers(MainActivity instance) {  
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    supertypeInjector.injectMembers(instance);
    instance.mainPresenter = mainPresenterProvider.get();
  }

  public static MembersInjector<MainActivity> create(MembersInjector<BaseActivity> supertypeInjector, Provider<MainPresenter> mainPresenterProvider) {  
      return new MainActivity_MembersInjector(supertypeInjector, mainPresenterProvider);
  }
}

