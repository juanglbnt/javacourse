package com.example.topic2;

public class BWPrinter implements Printer{
    final String NAME = "HP deskjet b&w";

    @Override
    public void print() {
        System.out.println("printing in " + NAME);
    }
}
