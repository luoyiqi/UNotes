package com.uos.notes.injector.component;

import android.content.Context;
import com.uos.notes.injector.module.FragmentModule;
import com.uos.notes.mvp.presenters.impl.SettingPresenter;
import com.uos.notes.mvp.presenters.impl.SettingPresenter_Factory;
import com.uos.notes.ui.fragments.SettingFragment;
import com.uos.notes.ui.fragments.SettingFragment_MembersInjector;
import com.uos.notes.utils.EverNoteUtils;
import com.uos.notes.utils.EverNoteUtils_Factory;
import com.uos.notes.utils.FileUtils_Factory;
import com.uos.notes.utils.ObservableUtils_Factory;
import com.uos.notes.utils.PreferenceUtils;
import com.uos.notes.utils.PreferenceUtils_Factory;
import com.uos.notes.utils.ThreadExecutorPool_Factory;
import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;
import javax.inject.Provider;
import net.tsz.afinal.FinalDb;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class DaggerFragmentComponent implements FragmentComponent {
  private Provider<Context> activityContextProvider;
  private Provider<FinalDb> finalDbProvider;
  private Provider<Context> appContextProvider;
  private Provider<PreferenceUtils> preferenceUtilsProvider;
  private Provider<EverNoteUtils> everNoteUtilsProvider;
  private Provider<SettingPresenter> settingPresenterProvider;
  private MembersInjector<SettingFragment> settingFragmentMembersInjector;

  private DaggerFragmentComponent(Builder builder) {  
    assert builder != null;
    initialize(builder);
  }

  public static Builder builder() {  
    return new Builder();
  }

  private void initialize(final Builder builder) {  
    this.activityContextProvider = new Factory<Context>() {
      private final ActivityComponent activityComponent = builder.activityComponent;
      @Override public Context get() {
        Context provided = activityComponent.activityContext();
        if (provided == null) {
          throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
        return provided;
      }
    };
    this.finalDbProvider = new Factory<FinalDb>() {
      private final ActivityComponent activityComponent = builder.activityComponent;
      @Override public FinalDb get() {
        FinalDb provided = activityComponent.finalDb();
        if (provided == null) {
          throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
        return provided;
      }
    };
    this.appContextProvider = new Factory<Context>() {
      private final ActivityComponent activityComponent = builder.activityComponent;
      @Override public Context get() {
        Context provided = activityComponent.appContext();
        if (provided == null) {
          throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
        return provided;
      }
    };
    this.preferenceUtilsProvider = PreferenceUtils_Factory.create(appContextProvider);
    this.everNoteUtilsProvider = EverNoteUtils_Factory.create(appContextProvider, ThreadExecutorPool_Factory.create(), finalDbProvider, preferenceUtilsProvider);
    this.settingPresenterProvider = SettingPresenter_Factory.create(activityContextProvider, finalDbProvider, everNoteUtilsProvider, preferenceUtilsProvider, ObservableUtils_Factory.create(), FileUtils_Factory.create());
    this.settingFragmentMembersInjector = SettingFragment_MembersInjector.create((MembersInjector) MembersInjectors.noOp(), settingPresenterProvider);
  }

  @Override
  public void inject(SettingFragment fragment) {  
    settingFragmentMembersInjector.injectMembers(fragment);
  }

  public static final class Builder {
    private FragmentModule fragmentModule;
    private ActivityComponent activityComponent;
  
    private Builder() {  
    }
  
    public FragmentComponent build() {  
      if (fragmentModule == null) {
        this.fragmentModule = new FragmentModule();
      }
      if (activityComponent == null) {
        throw new IllegalStateException("activityComponent must be set");
      }
      return new DaggerFragmentComponent(this);
    }
  
    public Builder fragmentModule(FragmentModule fragmentModule) {  
      if (fragmentModule == null) {
        throw new NullPointerException("fragmentModule");
      }
      this.fragmentModule = fragmentModule;
      return this;
    }
  
    public Builder activityComponent(ActivityComponent activityComponent) {  
      if (activityComponent == null) {
        throw new NullPointerException("activityComponent");
      }
      this.activityComponent = activityComponent;
      return this;
    }
  }
}

