package com.arsatapathy.designpatterns.abstractfactory;

public class RoundButton implements Button {

    @Override
    public void click() {
        System.out.println("Round Button Clicked!");
    }
}
