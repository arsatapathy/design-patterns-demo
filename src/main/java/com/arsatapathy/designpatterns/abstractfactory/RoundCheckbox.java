package com.arsatapathy.designpatterns.abstractfactory;

public class RoundCheckbox implements Checkbox {
    @Override
    public void click() {
        System.out.println("Round checkbox clicked.");
    }
}
