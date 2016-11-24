// Generated code from Butter Knife. Do not modify!
package com.uos.notes.ui;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class MainActivity$$ViewBinder<T extends com.uos.notes.ui.MainActivity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131624091, "field 'toolbar'");
    target.toolbar = finder.castView(view, 2131624091, "field 'toolbar'");
    view = finder.findRequiredView(source, 2131624048, "field 'refreshLayout'");
    target.refreshLayout = finder.castView(view, 2131624048, "field 'refreshLayout'");
    view = finder.findRequiredView(source, 2131624049, "field 'recyclerView'");
    target.recyclerView = finder.castView(view, 2131624049, "field 'recyclerView'");
    view = finder.findRequiredView(source, 2131624046, "field 'mDrawerLayout'");
    target.mDrawerLayout = finder.castView(view, 2131624046, "field 'mDrawerLayout'");
    view = finder.findRequiredView(source, 2131624053, "field 'mDrawerMenuListView'");
    target.mDrawerMenuListView = finder.castView(view, 2131624053, "field 'mDrawerMenuListView'");
    view = finder.findRequiredView(source, 2131624052, "field 'drawerRootView'");
    target.drawerRootView = view;
    view = finder.findRequiredView(source, 2131624051, "field 'fab' and method 'newNote'");
    target.fab = finder.castView(view, 2131624051, "field 'fab'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.newNote(p0);
        }
      });
    view = finder.findRequiredView(source, 2131624047, "field 'coordinatorLayout'");
    target.coordinatorLayout = finder.castView(view, 2131624047, "field 'coordinatorLayout'");
    view = finder.findRequiredView(source, 2131624050, "field 'progressWheel'");
    target.progressWheel = finder.castView(view, 2131624050, "field 'progressWheel'");
  }

  @Override public void unbind(T target) {
    target.toolbar = null;
    target.refreshLayout = null;
    target.recyclerView = null;
    target.mDrawerLayout = null;
    target.mDrawerMenuListView = null;
    target.drawerRootView = null;
    target.fab = null;
    target.coordinatorLayout = null;
    target.progressWheel = null;
  }
}
