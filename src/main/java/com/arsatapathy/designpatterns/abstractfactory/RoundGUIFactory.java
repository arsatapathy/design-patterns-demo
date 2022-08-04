package com.arsatapathy.designpatterns.abstractfactory;

public class RoundGUIFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new RoundButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new RoundCheckbox();
    }
}
