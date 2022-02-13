package com.juan.topic3functionalprogramming.map;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class MapApp {
    private Map<Integer, String> map;

    public static void main(String[] args) {
        MapApp map = new MapApp();

        map.populateMap();
        map.printMap();
        System.out.println("\n---put if absent---");
        map.putIfAbsent();
        map.printMap();
        System.out.println("\n---operate---");
        map.operateIfPresent();
        System.out.println("\n---get or default---");
        map.getDefault();
        System.out.println("\n---collect---");
        map.collect();
    }

    public void populateMap(){
        map =  new HashMap<>();
        map.put(1, "james");
        map.put(2, "cassie");
        map.put(3, "randall");
    }

    public void printMap(){
        //map.forEach((key, value) -> System.out.println("key: " + key + " value: " + value));
        map.entrySet().stream().forEach(System.out::println);
    }

    public void putIfAbsent(){
        map.putIfAbsent(4, "jamie");
        map.putIfAbsent(4, "new");
    }

    public void operateIfPresent(){
        map.computeIfPresent(3, (key, value) -> key + value);
        System.out.println(map.get(3));
    }

    public void getDefault(){
        String value = map.getOrDefault(5, "default value");
        System.out.println(value);
    }

    public void collect(){
        Map<Integer, String> collectedMap = map.entrySet().stream()
                .filter(item -> item.getValue().contains("jam"))
                .collect(Collectors.toMap(p -> p.getKey(), p -> p.getValue()));

        collectedMap.forEach((key, value) -> System.out.println("key: " + key + " value " + value));
    }
}
