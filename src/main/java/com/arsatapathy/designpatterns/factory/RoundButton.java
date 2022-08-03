package com.arsatapathy.designpatterns.factory;

public class RoundButton implements Button {

    @Override
    public void click() {
        System.out.println("Round Button");
    }
}
