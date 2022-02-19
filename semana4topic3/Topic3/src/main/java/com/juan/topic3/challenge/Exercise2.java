package com.juan.topic3.challenge;

import java.util.*;
import java.util.function.Predicate;

public class Exercise2 {

    public Exercise2() {
    }

    public Predicate<Integer> validNumberOfTestCases = n -> n >= 1 && n <= 10;
    public Predicate<Integer> validNumberOfPasswords = n -> n >= 1 && n <= 10;

    public void getPasswords() {
        Scanner scan = new Scanner(System.in);
        int testCasesNumber;
        int numberOfPasswords;
        String password;
        String loginAttempt;
        List<String> passwordList = new ArrayList<>();
        Map<String, List<String>> passwordMap = new HashMap<>();

        do {
            System.out.print("Enter the number of cases\n" +
                    "a number between 1 and 10: ");
            testCasesNumber = scan.nextInt();

        }while (!validNumberOfTestCases.test(testCasesNumber));

        for(int i = 0; i < testCasesNumber; i++) {

            do {
                System.out.println("enter the number of passwords\n" +
                        "A number between 1 and 10: ");
                numberOfPasswords = scan.nextInt();
            }while (!validNumberOfPasswords.test(numberOfPasswords));

            for(int j = 0; j < numberOfPasswords; j++) {
                password = scan.next();
                passwordList.add(password);
            }

            System.out.print("");
            loginAttempt = scan.next();
            passwordMap.put(loginAttempt, passwordList);
            passwordList.clear();
        }
        printMap(passwordMap);

    }

    public void printMap(Map<String, List<String>> map) {
        Iterator it = map.keySet().iterator();

        while(it.hasNext()) {
            String key = it.next().toString();
            System.out.println("attempt: " + key + " passwords " + map.get(key));
        }
    }

    public String verLista(List<String> list) {
        String lista = "";

        for (String element : list) {
            lista += element + " ";
        }
        return lista;
    }

}
