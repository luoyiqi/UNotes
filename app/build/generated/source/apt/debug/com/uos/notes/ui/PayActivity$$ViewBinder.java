// Generated code from Butter Knife. Do not modify!
package com.uos.notes.ui;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class PayActivity$$ViewBinder<T extends com.uos.notes.ui.PayActivity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131624091, "field 'toolbar'");
    target.toolbar = finder.castView(view, 2131624091, "field 'toolbar'");
  }

  @Override public void unbind(T target) {
    target.toolbar = null;
  }
}
