package Exercises;

public class ArrayToString {

    public static String returnString(int[] numbers){
        String stringOfNumbers = "[";

        for(int i = 0; i < numbers.length; i++){
            stringOfNumbers += numbers[i];
            if(i < numbers.length-1){
                stringOfNumbers += ", ";
            }
        }
        stringOfNumbers += "]";
        return stringOfNumbers;
    }
}
