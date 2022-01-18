package Exercises;

import java.util.Scanner;

public class TriangularPattern {

    static int size;
    static Scanner in = new Scanner(System.in);

    public static int getSize(){
        System.out.print("enter the size > ");
        size = in.nextInt();
        return size;
    }


    public static String printPatternA(int size){
        String pattern = "";

        for(int row = 1; row <= size; row++){
            for(int col = 1; col <= row; col++){
                pattern += " # ";
            }
            pattern += "\n";
        }
        return pattern;
    }

    public static String printPatternB(int size){

        String pattern = "";
        for(int row = size; row > 0; row--){
            for(int col = row; col > 0; col--){
                pattern += " # ";
            }
            pattern += "\n";
        }
        return pattern;
    }

    public static String printPatternC(){
        String pattern = "";

        return pattern;
    }

    public static String printPatternD(int size){
        String pattern = "";

        for(int row = 1; row <= size; row++){
            for(int aux = size-row; aux > 0; aux--){
                pattern += "  ";
            }
            for(int col = 1; col <= row; col++){
                pattern += " # ";
            }
            pattern += "\n";

        }

        return pattern;
    }

    public static void printAll(){
        getSize();
        System.out.print(printPatternA(size) + "\n");
        System.out.print(printPatternB(size) + "\n");
        System.out.print(printPatternC(size) + "\n");
        System.out.print(printPatternD(size) + "\n");
   /*     System.out.println();
        printPatternB(size);
        System.out.println();
        printPatternC(size);
        System.out.println();
        printPatternD(size);*/
    }

}
