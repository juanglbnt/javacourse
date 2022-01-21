package Exercises;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int input;

        do{
            System.out.println("\n0. exit\n1. Exponent\n2. Magic Sum\n3. Print Arrays\n4. arrays to string\n" +
                    "5. contains");
            input = in.nextInt();

            switch(input){
                case 1:
                    Exponent.execute();
                    break;
                case 2:
                    HasEight.magicSum();
                    break;
                case 3:
                    break;
                case 4:
                    break;
            }

        }while(input != 0);


        int[] nums = {1, 2, 3, 4, 5, 100};
        int[] nums2 = {};
        int[] nums3 = {5};
        double[] doubleNumbers = {3.4, 4.5, 6.9, 10.8};

        PrintArrays.print(nums);
        PrintArrays.print(doubleNumbers);

        //System.out.println("first array: " + ArrayToString.returnString(nums));
        //System.out.println("second array: " + ArrayToString.returnString(nums2));
        //System.out.println("third array: " + ArrayToString.returnString(nums3));


        /*System.out.print("enter a number: ");
        input = in.nextInt();

        if(OddEvenTest.isOdd(input)){
            System.out.print("IT'S EVEN");
        }else{
            System.out.print("IT'S ODD");
        }*/
    }
}
