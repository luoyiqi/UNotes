// Generated code from Butter Knife. Do not modify!
package com.uos.notes.ui;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class NoteActivity$$ViewBinder<T extends com.uos.notes.ui.NoteActivity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131624091, "field 'toolbar'");
    target.toolbar = finder.castView(view, 2131624091, "field 'toolbar'");
    view = finder.findRequiredView(source, 2131624054, "field 'labelEditText'");
    target.labelEditText = finder.castView(view, 2131624054, "field 'labelEditText'");
    view = finder.findRequiredView(source, 2131624055, "field 'contentEditText'");
    target.contentEditText = finder.castView(view, 2131624055, "field 'contentEditText'");
    view = finder.findRequiredView(source, 2131624056, "field 'oprTimeLineTextView'");
    target.oprTimeLineTextView = finder.castView(view, 2131624056, "field 'oprTimeLineTextView'");
  }

  @Override public void unbind(T target) {
    target.toolbar = null;
    target.labelEditText = null;
    target.contentEditText = null;
    target.oprTimeLineTextView = null;
  }
}
