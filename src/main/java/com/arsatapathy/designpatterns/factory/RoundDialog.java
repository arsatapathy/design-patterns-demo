package com.arsatapathy.designpatterns.factory;

public class RoundDialog implements Dialog {

    @Override
    public Button createButton() {
        return new RoundButton();
    }
}
