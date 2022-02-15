package com.juan.topic3functionalprogramming.highorderfunctions;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class HighOrderApp {

    private Function<String, String> toUpperCase = x -> x.toUpperCase();
    private Function<String, String> toLowerCase = x -> x.toLowerCase();

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("12");
        list.add("123");
        list.add("12345");
        list.add("123456");

        HighOrderApp highOrderApp = new HighOrderApp();
        highOrderApp.print(highOrderApp.toUpperCase, "this to upper case");
        highOrderApp.print(highOrderApp.toLowerCase, "THIS TO LOWER CASE");

        System.out.println("***return a function***");
        String hello = highOrderApp.show("hello ").apply("Juan");
        System.out.println(hello);

        System.out.println("***consumer predicate***");
        //highOrderApp.filter(list, System.out::println, 5, null);
        highOrderApp.filter(list, System.out::println, 0, "5");


    }

    public void print(Function<String, String> function, String value) {
        System.out.println(function.apply(value));
    }

    public Function<String, String> show(String message) {
        return (String x) -> message + x;
    }

    public void filter(List<String> list, Consumer<String> consumer, int length, String value) {
        //list.stream().filter(this.filterLogic(length)).forEach(consumer);
        list.stream().filter(this.filterLogic(value)).forEach(consumer);
    }

    public Predicate<String> filterLogic(int length) {
        return text -> text.length() < length;
    }

    public Predicate<String> filterLogic(String value) {
        return text -> text.contains(value);
    }
}
