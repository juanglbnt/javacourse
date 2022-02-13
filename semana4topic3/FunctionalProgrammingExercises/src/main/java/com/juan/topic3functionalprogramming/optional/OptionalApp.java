package com.juan.topic3functionalprogramming.optional;

import java.util.Optional;

public class OptionalApp {

    public static void main(String[] args) {
        OptionalApp optApp = new OptionalApp();

        //optApp.test(null);
        optApp.orElse(null);
        optApp.orElse("landscape");
        //optApp.orElseThrow(null);
        optApp.isPresent(null);
    }

    public void test(String value){
        //System.out.println(value.contains("landscape"));//nullPointerException here

        try{
            Optional op = Optional.empty();
            op.get();
        }catch (Exception e){
            System.out.println("not such element");
        }
    }

    public void orElse(String value){
        Optional<String> optionalS = Optional.ofNullable(value);
        String xValue = optionalS.orElse("valor por defecto");
        System.out.println(xValue);
    }

    public void orElseThrow(String value){
        Optional<String> optionalS = Optional.ofNullable(value);
        optionalS.orElseThrow(NumberFormatException::new);
    }

    public void isPresent(String value){
        Optional<String> optionalS = Optional.ofNullable(value);
        System.out.println(optionalS.isPresent());
    }
}
