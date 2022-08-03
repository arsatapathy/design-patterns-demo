package com.arsatapathy.designpatterns.factory;

public class SquareButton implements Button {

    @Override
    public void click() {
        System.out.println("Square Button");
    }
}
