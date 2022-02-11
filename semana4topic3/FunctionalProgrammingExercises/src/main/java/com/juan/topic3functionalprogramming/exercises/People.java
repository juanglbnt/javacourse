package com.juan.topic3functionalprogramming.exercises;

public interface People {

    default void salute(){
        System.out.println("hello");
    }

    void salute2();
}
