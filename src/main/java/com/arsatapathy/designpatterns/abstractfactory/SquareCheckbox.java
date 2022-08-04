package com.arsatapathy.designpatterns.abstractfactory;

public class SquareCheckbox implements Checkbox {

    @Override
    public void click() {
        System.out.println("Square checkbox clicked.");
    }
}
