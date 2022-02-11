package com.juan.topic3functionalprogramming.lists;

import java.util.ArrayList;
import java.util.List;

public class CollectionApp {
    private List<String> lista;

    public static void main(String[] args) {
        CollectionApp collectionApp = new CollectionApp();
        collectionApp.loadInList();
        collectionApp.forEach();
        collectionApp.usingRemoveIf();
        System.out.println("after removing element 2");
        collectionApp.forEach();
    }

    public void forEach() {
        //metodo tradicional
        /*for(String element:lista){
            System.out.println(element);
        }*/

        //usando los conceptos de programacion funcional
        /*lista.forEach(element -> System.out.println(element));*/

        //con referencia a metodo
        lista.forEach(System.out::println);
    }

    public void usingRemoveIf() {
        lista.removeIf(element -> element.equalsIgnoreCase("element 2"));
    }

    public void usingSort(){

    }

    public void loadInList() {
        lista = new ArrayList<>();
        lista.add("element 1");
        lista.add("element 2");
        lista.add("element 3");
        lista.add("element 4");
        lista.add("element 5");
    }
}
