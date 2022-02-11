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
    }

    public void filter(){
        
    }


}
