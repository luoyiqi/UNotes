package com.uos.notes.injector.component;

import android.app.Activity;
import android.content.Context;
import com.uos.notes.injector.module.ActivityModule;
import com.uos.notes.injector.module.ActivityModule_ProvideActivityFactory;
import com.uos.notes.injector.module.ActivityModule_ProvideContextFactory;
import com.uos.notes.mvp.presenters.impl.MainPresenter;
import com.uos.notes.mvp.presenters.impl.MainPresenter_Factory;
import com.uos.notes.mvp.presenters.impl.NotePresenter;
import com.uos.notes.mvp.presenters.impl.NotePresenter_Factory;
import com.uos.notes.ui.MainActivity;
import com.uos.notes.ui.MainActivity_MembersInjector;
import com.uos.notes.ui.NoteActivity;
import com.uos.notes.ui.NoteActivity_MembersInjector;
import com.uos.notes.ui.SettingActivity;
import com.uos.notes.utils.EverNoteUtils;
import com.uos.notes.utils.EverNoteUtils_Factory;
import com.uos.notes.utils.ObservableUtils_Factory;
import com.uos.notes.utils.PreferenceUtils;
import com.uos.notes.utils.PreferenceUtils_Factory;
import com.uos.notes.utils.ThreadExecutorPool_Factory;
import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import dagger.internal.ScopedProvider;
import javax.annotation.Generated;
import javax.inject.Provider;
import net.tsz.afinal.FinalDb;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class DaggerActivityComponent implements ActivityComponent {
  private Provider<Context> provideContextProvider;
  private Provider<FinalDb> finalDbProvider;
  private Provider<Context> contextProvider;
  private Provider<PreferenceUtils> preferenceUtilsProvider;
  private Provider<EverNoteUtils> everNoteUtilsProvider;
  private Provider<MainPresenter> mainPresenterProvider;
  private MembersInjector<MainActivity> mainActivityMembersInjector;
  private Provider<NotePresenter> notePresenterProvider;
  private MembersInjector<NoteActivity> noteActivityMembersInjector;
  private Provider<Activity> provideActivityProvider;

  private DaggerActivityComponent(Builder builder) {  
    assert builder != null;
    initialize(builder);
  }

  public static Builder builder() {  
    return new Builder();
  }

  private void initialize(final Builder builder) {  
    this.provideContextProvider = ScopedProvider.create(ActivityModule_ProvideContextFactory.create(builder.activityModule));
    this.finalDbProvider = new Factory<FinalDb>() {
      private final AppComponent appComponent = builder.appComponent;
      @Override public FinalDb get() {
        FinalDb provided = appComponent.finalDb();
        if (provided == null) {
          throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
        return provided;
      }
    };
    this.contextProvider = new Factory<Context>() {
      private final AppComponent appComponent = builder.appComponent;
      @Override public Context get() {
        Context provided = appComponent.context();
        if (provided == null) {
          throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
        return provided;
      }
    };
    this.preferenceUtilsProvider = PreferenceUtils_Factory.create(contextProvider);
    this.everNoteUtilsProvider = EverNoteUtils_Factory.create(contextProvider, ThreadExecutorPool_Factory.create(), finalDbProvider, preferenceUtilsProvider);
    this.mainPresenterProvider = MainPresenter_Factory.create(provideContextProvider, finalDbProvider, preferenceUtilsProvider, ObservableUtils_Factory.create(), everNoteUtilsProvider);
    this.mainActivityMembersInjector = MainActivity_MembersInjector.create((MembersInjector) MembersInjectors.noOp(), mainPresenterProvider);
    this.notePresenterProvider = NotePresenter_Factory.create(provideContextProvider, finalDbProvider);
    this.noteActivityMembersInjector = NoteActivity_MembersInjector.create((MembersInjector) MembersInjectors.noOp(), notePresenterProvider);
    this.provideActivityProvider = ScopedProvider.create(ActivityModule_ProvideActivityFactory.create(builder.activityModule));
  }

  @Override
  public void inject(MainActivity activity) {  
    mainActivityMembersInjector.injectMembers(activity);
  }

  @Override
  public void inject(NoteActivity activity) {  
    noteActivityMembersInjector.injectMembers(activity);
  }

  @Override
  public void inject(SettingActivity activity) {  
    MembersInjectors.noOp().injectMembers(activity);
  }

  @Override
  public Activity activity() {  
    return provideActivityProvider.get();
  }

  @Override
  public FinalDb finalDb() {  
    return finalDbProvider.get();
  }

  @Override
  public Context activityContext() {  
    return provideContextProvider.get();
  }

  @Override
  public Context appContext() {  
    return contextProvider.get();
  }

  public static final class Builder {
    private ActivityModule activityModule;
    private AppComponent appComponent;
  
    private Builder() {  
    }
  
    public ActivityComponent build() {  
      if (activityModule == null) {
        throw new IllegalStateException("activityModule must be set");
      }
      if (appComponent == null) {
        throw new IllegalStateException("appComponent must be set");
      }
      return new DaggerActivityComponent(this);
    }
  
    public Builder activityModule(ActivityModule activityModule) {  
      if (activityModule == null) {
        throw new NullPointerException("activityModule");
      }
      this.activityModule = activityModule;
      return this;
    }
  
    public Builder appComponent(AppComponent appComponent) {  
      if (appComponent == null) {
        throw new NullPointerException("appComponent");
      }
      this.appComponent = appComponent;
      return this;
    }
  }
}

