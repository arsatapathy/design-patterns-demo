package com.arsatapathy.designpatterns.abstractfactory;

public class Demo {
    public static void main(String[] args) {
        App app = new App(new RoundGUIFactory());

        app.click();

        app = new App(new SquareGuiFactory());

        app.click();
    }
}
