package com.arsatapathy.designpatterns.abstractfactory;

public class SquareButton implements Button {
    @Override
    public void click() {
        System.out.println("Square Button Clicked!");
    }
}
