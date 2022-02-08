package Exercises;

import java.util.Scanner;

public class HillPattern {
    static Scanner in = new Scanner(System.in);
    static int size;

    public static int getSize(){
        System.out.print("enter the size > ");
        size = in.nextInt();
        return size;
    }

    public static String printPatternA(int size){
        String patternA = "";

        for(int row = 0; row < size; row++){

            for(int col = size-row; col > 1; col--){
                patternA += " ";
                //System.out.print(" ");
            }

            for(int col = 0; col <= row; col++){
                patternA += "* ";
                //System.out.print("* ");
            }

            patternA += "\n";
            //System.out.println();
        }

        return patternA;
    }

    public static String printPatternB(int size){
        String patternB = "";

        for(int row = 1; row <= size; row++){

            for(int col = 1; col < row; col++){
                patternB += " ";
            }

            for(int col = row; col <= size; col++){
                patternB += "* ";
            }

            patternB += "\n";
        }

        return patternB;
    }

    public static String printPatternC(int size){
        String patternC1 = "";
        String patternC2 = "";
        String patternC = "";

        for(int row = size; row >= 1; row--){

            for(int col = 1; col < row; col++){
                patternC1 += " ";
            }

            for(int col = row; col <= size; col++){
                patternC1 += "* ";
            }

            patternC1 += "\n";
        }

        for(int row = 1; row <= size; row++){

            for(int col = 1; col < row; col++){
                patternC2 += " ";
            }

            for(int col = row; col <= size; col++){
                patternC2 += "* ";
            }

            patternC2 += "\n";
        }

        patternC = patternC1 + patternC2;
        return patternC;
    }


    public static void printAllPatterns(){
        int size = getSize();
        System.out.println(printPatternA(size));
        System.out.println(printPatternB(size));
        System.out.println(printPatternC(size));
    }
}
