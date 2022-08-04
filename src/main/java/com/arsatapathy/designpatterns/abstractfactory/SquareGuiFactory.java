package com.arsatapathy.designpatterns.abstractfactory;

public class SquareGuiFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new SquareButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new SquareCheckbox();
    }
}
