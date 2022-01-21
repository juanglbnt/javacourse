package Exercises;

public class PrintArrays {

    public static void print(int[] numbers){
        System.out.print("numbers [");
        for(int i = 0; i < numbers.length; i++){
            System.out.print(numbers[i]);
            if(i < numbers.length-1){
                System.out.print(", ");
            }
        }
        System.out.print("]");
    }

    public static void print(double[] numbers){
        System.out.print("numbers [");
        for(int i = 0; i < numbers.length; i++){
            System.out.print(numbers[i]);
            if(i < numbers.length-1){
                System.out.print(", ");
            }
        }
        System.out.print("]");

    }
}
