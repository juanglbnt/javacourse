package com.juan.topic3functionalprogramming.parallelstream;

import java.util.ArrayList;
import java.util.List;

public class ParallelStream {
    private List<Integer> numbers;

    public static void main(String[] args) {
        ParallelStream parallelStream = new ParallelStream();
        parallelStream.fillNumbers();
        //parallelStream.testStream();
        parallelStream.testParallelStream();
    }

    public void fillNumbers() {
        numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++){
            numbers.add(i);
        }
    }

    public void testStream() {
        numbers.stream().forEach(System.out::println);
    }

    public void testParallelStream() {
        numbers.parallelStream().forEach(System.out::println);
    }
}
