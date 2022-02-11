package com.juan.topic3functionalprogramming.MethodsReferences;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class Reference {

    public static void main(String[] args) {
        Reference reference = new Reference();
        reference.operate();
        reference.referenciateAnObject();
        //instanciar un metodo particular
        Operation operation2 = reference::referenciateAnConcreteObject;
        operation2.salute();
    }

    public static void referenceStaticMethod(){
        System.out.println("metodo referido");
    }

    public void operate(){
        /*Operation operation = () -> Reference.referenceStaticMethod();
        operation.salute();*/
        //referencia a metodo
        Operation operation1 = Reference::referenceStaticMethod;
        operation1.salute();
    }

    public void referenciateAnObject(){
        String[] names = {"juan", "ana", "maria"};

        //ejemplo de una implementacion "verbosa"
        Arrays.sort(names, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareToIgnoreCase(o2);
            }
        });
        System.out.println("verbose");
        System.out.println(Arrays.toString(names));

        //en lambda
        System.out.println("lambda");
        Arrays.sort(names, (s1,s2) -> s1.compareToIgnoreCase(s2));
        System.out.println(Arrays.toString(names));

        //usando referencia a metodo
        System.out.println("reference method");
        Arrays.sort(names, String::compareToIgnoreCase);
        System.out.println(Arrays.toString(names));
    }

    public void referenciateAnConcreteObject(){
        System.out.println("referenciate THIS METHOD that isn't static");
    }

}
