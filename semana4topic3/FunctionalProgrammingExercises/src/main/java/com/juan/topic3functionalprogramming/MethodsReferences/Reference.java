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

        //
        reference.referenceToAConstructor();
    }

    public static void referenceStaticMethod(){
        System.out.println("metodo referido");
    }

    public void operate(){
        /*Operation operation = () -> Reference.referenceStaticMethod();
        operation.salute();*/
        /*referencia a metodo, le estamos enviando un metodo como parametro
        para el metodo de la interfaz*/
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

    public void referenceToAConstructor(){
        InterfacePerson iperson = new InterfacePerson() {
            @Override
            public Person create(int id, String name) {
                return new Person(id, name);
            }
        };
        Person person1 = iperson.create(1, "ana maria");
        System.out.println("person 1: " + person1.getId() + " " + person1.getName());

        //como metodo lambda
        InterfacePerson iperson2 = (id, name) -> new Person(id, name);
        Person person2 = iperson2.create(2, "juan");
        System.out.println("person 2: (lambda)" + person2.getId() + " " + person2.getName());

        //como referencia a metodo de interface funcional
        InterfacePerson interfacePerson = Person::new;
        Person person3 = interfacePerson.create(3, "cmaille");
        System.out.println("person 3 (reference to a functional interface method)\n" +
                person3.getId() + " " + person3.getName());

    }
}
