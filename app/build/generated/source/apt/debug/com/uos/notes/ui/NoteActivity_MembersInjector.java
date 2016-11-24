package com.uos.notes.ui;

import com.uos.notes.mvp.presenters.impl.NotePresenter;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class NoteActivity_MembersInjector implements MembersInjector<NoteActivity> {
  private final MembersInjector<BaseActivity> supertypeInjector;
  private final Provider<NotePresenter> notePresenterProvider;

  public NoteActivity_MembersInjector(MembersInjector<BaseActivity> supertypeInjector, Provider<NotePresenter> notePresenterProvider) {  
    assert supertypeInjector != null;
    this.supertypeInjector = supertypeInjector;
    assert notePresenterProvider != null;
    this.notePresenterProvider = notePresenterProvider;
  }

  @Override
  public void injectMembers(NoteActivity instance) {  
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    supertypeInjector.injectMembers(instance);
    instance.notePresenter = notePresenterProvider.get();
  }

  public static MembersInjector<NoteActivity> create(MembersInjector<BaseActivity> supertypeInjector, Provider<NotePresenter> notePresenterProvider) {  
      return new NoteActivity_MembersInjector(supertypeInjector, notePresenterProvider);
  }
}

