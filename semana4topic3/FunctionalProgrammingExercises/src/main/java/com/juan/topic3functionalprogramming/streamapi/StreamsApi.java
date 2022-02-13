package com.juan.topic3functionalprogramming.streamapi;

import java.util.ArrayList;
import java.util.List;

public class StreamsApi {
    private List<String> list;
    private List<String> numbers;

    public StreamsApi(){
        list = new ArrayList<>();
        list.add("juan");
        list.add("juana");
        list.add("ramsey");
        list.add("randall");

        numbers = new ArrayList<>();
        numbers.add("4");
        numbers.add("2");
        numbers.add("1");
        numbers.add("3");
    }

    public static void main(String[] args) {
        StreamsApi streamsApi = new StreamsApi();
        System.out.println("---filter start with r---");
        streamsApi.filter();

        System.out.println("\n---sort---");
        streamsApi.sortDescending();

        System.out.println("\n---transform to uppercase and numbers incremented---");
        streamsApi.transform();

        System.out.println("\n---list limited to 2 elements---");
        streamsApi.limit();

        System.out.println("\n---elements in the list---");
        streamsApi.count();
    }

    public void filter() {
        list.stream().filter(element -> element.startsWith("r"))
                .forEach(System.out::println);
    }

    public void sortDescending() {
        list.stream().sorted((item1, item2) -> item2.compareToIgnoreCase(item1))
                .forEach(System.out::println);
    }

    public void transform() {
        list.stream().map(String::toUpperCase).forEach(System.out::println);
        numbers.stream().map(element -> Integer.parseInt(element) + 1).forEach(System.out::println);
    }

    public void limit() {
        list.stream().limit(2).forEach(System.out::println);
    }

    public void count() {
        long numberLong = list.stream().count();
        System.out.println(numberLong);
    }

}
