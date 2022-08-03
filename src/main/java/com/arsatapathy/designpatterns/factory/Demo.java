package com.arsatapathy.designpatterns.factory;

public class Demo {

    public static void main(String[] args) {
        Dialog dialog = new RoundDialog();

        dialog.render();

        dialog = new SquareDialog();

        dialog.render();
    }
}
