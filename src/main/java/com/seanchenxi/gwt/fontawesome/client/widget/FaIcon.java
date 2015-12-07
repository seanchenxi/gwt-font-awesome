package com.seanchenxi.gwt.fontawesome.client.widget;

import com.google.gwt.dom.client.Document;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.HasClickHandlers;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.user.client.ui.Widget;

import com.seanchenxi.gwt.fontawesome.client.resources.Fa;


public class FaIcon extends Widget implements HasClickHandlers {

  public static FaIcon create(String... styleNames){
    if(styleNames == null){
      throw new IllegalArgumentException("should give at least one style");
    }
    FaIcon faIcon = new FaIcon();
    for(String style : styleNames){
      if(style != null && !style.trim().isEmpty()){
        faIcon.addStyleName(style);
      }
    }
    return faIcon;
  }

  private FaIcon() {
    setElement(Document.get().createElement("i"));
    setStyleName(Fa.fa());
  }

  public FaIcon(String faIcon) {
    this();
    if(faIcon == null){
      throw new IllegalArgumentException("faIcon should not be null");
    }
    addStyleName(faIcon);
  }

  @Override
  public HandlerRegistration addClickHandler(ClickHandler handler) {
    return addDomHandler(handler, ClickEvent.getType());
  }

}
