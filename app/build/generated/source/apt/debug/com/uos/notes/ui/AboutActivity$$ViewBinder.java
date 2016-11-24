// Generated code from Butter Knife. Do not modify!
package com.uos.notes.ui;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class AboutActivity$$ViewBinder<T extends com.uos.notes.ui.AboutActivity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131624091, "field 'toolbar'");
    target.toolbar = finder.castView(view, 2131624091, "field 'toolbar'");
    view = finder.findRequiredView(source, 2131624043, "field 'versionTextView' and method 'versionClick'");
    target.versionTextView = finder.castView(view, 2131624043, "field 'versionTextView'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.versionClick(p0);
        }
      });
    view = finder.findRequiredView(source, 2131624045, "method 'projectHomeClick'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.projectHomeClick(p0);
        }
      });
    view = finder.findRequiredView(source, 2131624044, "method 'blogClick'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.blogClick(p0);
        }
      });
  }

  @Override public void unbind(T target) {
    target.toolbar = null;
    target.versionTextView = null;
  }
}
