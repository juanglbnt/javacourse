package com.example.topic2;

public class ColorPrinter implements Printer{
    final String NAME = "cannon pixma color";

    @Override
    public void print() {
        System.out.println("printing in " + NAME);
    }
}
