package Exercises;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 100};
        int[] nums1 =  {1, 2, 3, 4, 5, 100};
        int[] nums2 = {};
        int[] nums3 = {5};
        int[] nums4 = {1, 8, 4, 2};
        int[] nums5 = {1, 2, 3, 4, 5, 1};
        int[] nums6 = {3, 4, 7, 6, 4, 1};
        int[] nums7 = {9, 8, 22, 23, 60, 80, 80, 87};
        double[] doubleNumbers = {3.4, 4.5, 6.9, 10.8};


        Scanner in = new Scanner(System.in);
        int input;

        do{
            System.out.println("\n0. exit\n1. Exponent\n2. Magic Sum\n3. Print Arrays\n4. arrays to string\n" +
                    "5. it's odd/even\n6. contains\n7. search\n8. equals\n9. copy" +
                    "\n10. swap arrays\n11. reverse array\n12. grade statics\n");
            input = in.nextInt();

            switch(input){
                case 1:
                    Exponent.execute();
                    break;
                case 2:
                    HasEight.magicSum();
                    break;
                case 3:
                    ArrayMethods.print(nums);
                    ArrayMethods.print(doubleNumbers);
                    break;
                case 4:
                    System.out.println("first array: " + ArrayMethods.returnString(nums));
                    System.out.println("second array: " + ArrayMethods.returnString(nums2));
                    System.out.println("third array: " + ArrayMethods.returnString(nums3));
                    break;
                case 5:
                    OddEvenTest.validate();
                    break;
                case 6:
                    ArrayMethods.print(nums);
                    System.out.println("\ncontains 100?: " + ArrayMethods.contains(nums, 100));
                    System.out.println("contains 101?: " + ArrayMethods.contains(nums, 101));
                    break;
                case 7:
                    ArrayMethods.print(nums);
                    System.out.println("\nindex of 3: " + ArrayMethods.search(nums, 3));
                    System.out.println("index of 19: " + ArrayMethods.search(nums, 19));
                    break;
                case 8:
                    ArrayMethods.print(nums);
                    System.out.print(" ");
                    ArrayMethods.print(nums1);
                    System.out.println("\nare equals?: " + ArrayMethods.equals(nums, nums1));
                    System.out.println();

                    ArrayMethods.print(nums);
                    System.out.print(" ");
                    ArrayMethods.print(nums5);
                    System.out.println("\nare equals?: " + ArrayMethods.equals(nums, nums5));
                    System.out.println();

                    ArrayMethods.print(nums);
                    System.out.print(" ");
                    ArrayMethods.print(nums3);
                    System.out.println("\nare equals?: " + ArrayMethods.equals(nums, nums3));
                    break;
                case 9:
                    System.out.print("copy of: ");
                    ArrayMethods.print(nums4);
                    System.out.print(" = ");
                    ArrayMethods.print(ArrayMethods.copyOf(nums4));
                    break;
                case 10:
                    System.out.print("arrays to swap: nums5: ");
                    ArrayMethods.print(nums5);
                    System.out.print(", nums6: ");
                    ArrayMethods.print(nums6);
                    ArrayMethods.swapTwoarrays(nums5, nums6);

                    System.out.println();
                    System.out.print("now nums5: ");
                    ArrayMethods.print(nums5);
                    System.out.print(", nums6: ");
                    ArrayMethods.print(nums6);
                case 11:
                    ArrayMethods.reverseArray(nums1);
                    break;
                case 12:
                    GradeStatistics statistics = new GradeStatistics();
                    statistics.computeValues();
                    break;
                case 13:
                    GradeStatistics stat = new GradeStatistics();
                    stat.makeHistogram(nums7);
                    break;
                default:
                    break;


            }

        }while(input != 0);

    }
}
