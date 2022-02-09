package com.example.topic2;

public class Printing {

    public static Printer selectPrinter(String printerType){
        switch (printerType){
            case "bw":
                return new BWPrinter();
            case "color":
                return new ColorPrinter();
            default:
                System.out.println("no such printer");
                return null;
        }
    }
}
