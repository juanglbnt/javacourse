package com.juan.topic3functionalprogramming.exercises;

public class Person implements People{


    public static void main(String[] args) {
        Person person = new Person();
        person.salute();
        person.salute2();
    }

    @Override
    public void salute() {
        People.super.salute();
    }

    @Override
    public void salute2() {
        System.out.println("hello again");
    }
}
