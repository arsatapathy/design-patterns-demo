package com.arsatapathy.designpatterns.factory;

public class SquareDialog implements Dialog {

    @Override
    public Button createButton() {
        return new SquareButton();
    }
}
