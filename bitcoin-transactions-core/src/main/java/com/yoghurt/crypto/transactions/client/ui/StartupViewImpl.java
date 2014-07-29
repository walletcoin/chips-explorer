package com.yoghurt.crypto.transactions.client.ui;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class StartupViewImpl extends Composite implements StartupView {
  interface StartupViewImplUiBinder extends UiBinder<Widget, StartupViewImpl> {}

  private static final StartupViewImplUiBinder UI_BINDER = GWT.create(StartupViewImplUiBinder.class);

  private Presenter presenter;

  public StartupViewImpl() {
    initWidget(UI_BINDER.createAndBindUi(this));
  }

  public void setPresenter(final Presenter presenter) {
    this.presenter = presenter;
  }

  @UiHandler("test")
  void onTestClick(final ClickEvent e) {
    presenter.goToTest();
  }
}