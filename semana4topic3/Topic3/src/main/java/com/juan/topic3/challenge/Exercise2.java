package com.juan.topic3.challenge;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Exercise2 {
    List<List> passwordMap = new ArrayList<>();

    public Exercise2() {

    }

    Scanner in = new Scanner(System.in);

    public Predicate<Integer> validNumberOfTestCases = n -> n >= 1 && n <= 10;
    public Predicate<Integer> validNumberOfPasswords = n -> n >= 1 && n <= 10;

    public void execution() {
        getPasswords();
        computeCracker();
    }

    public void computeCracker() {
        List<String> passwords;
        String attempt;

        for (int i = 0; i < passwordMap.size(); i++) {
            List<String> subMap = new ArrayList<>();
            subMap = passwordMap.get(i);

            attempt = subMap.get(subMap.size()-1);
            passwords = subMap.subList(0,subMap.size()-1);

            //para efectos de prueba
           /* System.out.println("attempt " + i + attempt);
            passwords.forEach(System.out::println);
            System.out.println("///");*/

            List<String> resultPasswords = passwordCracker(passwords, attempt);
            String achieved = resultPasswords.stream().collect(Collectors.joining());

            if (achieved.equals(attempt)) {
                System.out.println(resultPasswords.stream().collect(Collectors.joining(" ")));
            }else {
                System.out.println("error, wrong password");
            }
            System.out.println("");
        }
    }

    public List<String> passwordCracker(List<String> passwords, String attempt) {
        return passwords.stream()
                .filter(attempt::startsWith)
                .flatMap(password -> Stream.concat(Stream.of(password),
                        passwordCracker(passwords, attempt.substring(password.length()))
                                .stream()))
                .collect(Collectors.toList());
    }

    public List<List> getPasswords() {
        int numberOfCases;
        int numberOfPasswords;
        String password;
        String attempt;

        do{
            System.out.print("enter the number of test cases [1 - 10]: ");
            numberOfCases = in.nextInt();
        }while (!validNumberOfTestCases.test(numberOfCases));

        for(int i = 0; i < numberOfCases; i++) {
            List<String> passwordList = new ArrayList<>();
            do {
                System.out.print("enter the number of passwords [1 - 10]: ");
                numberOfPasswords = in.nextInt();
            }while(!validNumberOfPasswords.test(numberOfPasswords));

            for(int j = 0; j < numberOfPasswords; j++) {
                password = in.next();
                passwordList.add(password);
            }

            attempt = in.next();
            passwordList.add(attempt);
            passwordMap.add(passwordList);

        }
        return passwordMap;
    }

    /*
    * para efectos de prueba
    * en realidad no se trabaja con mapas en este ejercicio
    * sino que utilizo una lista de listas que pretendo ver como un hashmap
    * o algo asi*/
    public void printMap(List<List> map) {
        for(int i = 0; i < map.size(); i++) {
            System.out.println(i + map.get(i).toString());
        }
    }
}
