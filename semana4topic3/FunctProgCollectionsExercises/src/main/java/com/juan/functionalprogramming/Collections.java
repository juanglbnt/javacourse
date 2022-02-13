package com.juan.functionalprogramming;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class Collections {
    final List<String> friends = Arrays.asList("brian", "nate", "neal", "raju", "sara", "scott");

    public static void main(String[] args) {
        Collections collections = new Collections();
        collections.printForeachLambda();
        collections.toUpperCase();
        collections.filter();
    }

    public void printCollection() {
        friends.forEach(new Consumer<String>() {
            @Override
            public void accept(final String name) {
                System.out.println(name);
            }
        });
    }

    public void printForeachLambda() {
        //friends.forEach((name) -> System.out.println(name));
        friends.forEach(System.out::println);
    }

    public void toUpperCase() {
        friends.stream()
                .map(name -> name.toUpperCase())
                .forEach(name -> System.out.print(name + " "));

        //using reference to a method
        System.out.println();
        friends.stream()
                .map(String::toUpperCase)
                .forEach(name -> System.out.print(name + " "));
    }

    public void filter() {
        final List<String> startsWithN =
                friends.stream()
                        .filter(name -> name.startsWith("n"))
                        .collect(Collectors.toList());

        System.out.println("\nstarts with \"n\"");
        startsWithN.forEach(System.out::println);
    }
}
