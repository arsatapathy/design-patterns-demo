package com.arsatapathy.designpatterns.factory;

public interface Dialog {

    default void render() {
        Button button = createButton();

        button.render();
    }

    Button createButton();
}
