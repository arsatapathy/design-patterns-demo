package com.arsatapathy.designpatterns.factory;

public interface Button {

    default void render() {
        click();
    }

    void click();
}
