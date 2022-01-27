package Exercises;

public class ArrayMethods {

    public static boolean contains(int[] arrayOfNumbers, int key){
        int arraySize = arrayOfNumbers.length;
        boolean contains = false;

        for(int i = 0; i < arraySize; i++){
            if(arrayOfNumbers[i] == key){
                contains = true;
                break;
            }
        }

        return contains;
    }

    //exercise 10.4
    public static void print(int[] numbers){
        System.out.print("[");
        for(int i = 0; i < numbers.length; i++){
            System.out.print(numbers[i]);
            if(i < numbers.length-1){
                System.out.print(", ");
            }
        }
        System.out.print("]");
    }
    //10.4
    public static void print(double[] numbers){
        System.out.print("[");
        for(int i = 0; i < numbers.length; i++){
            System.out.print(numbers[i]);
            if(i < numbers.length-1){
                System.out.print(", ");
            }
        }
        System.out.print("]");

    }

    //exercise 10.5
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

    //exercise 10.7
    public static int search(int[] array, int key){
        int verifier = 0;
        int sizeOfArr;
        int output = 0;

        sizeOfArr = array.length;
        for(int i = 0; i < sizeOfArr; i++){
            if(array[i] == key){
                output = i;
                verifier++;
            }
        }
        if(verifier == 0){
            output = -1;
        }

        return output;
    }

    //exercise 10.8
    public static boolean equals(int[] array1, int[] array2){
        int sizeOfArray1, sizeOfArray2;
        boolean areEquals = true;

        sizeOfArray1 = array1.length;
        sizeOfArray2 = array2.length;

        if(sizeOfArray1 == sizeOfArray2){

            for(int i = 0; i < sizeOfArray1; i++){
                if(!(array1[i] == array2[i])){
                    areEquals = false;
                    break;
                }
            }

        }else{
            areEquals = false;
        }

        return areEquals;
    }

    //exercise 10.9
    public static int[] copyOf(int[] arrayToCopy){
        int sizeOfArray;
        sizeOfArray = arrayToCopy.length;
        int[] clonedArray;
        clonedArray = new int[sizeOfArray];

        for(int i = 0; i < sizeOfArray; i++){
            clonedArray[i] = arrayToCopy[i];
        }

        return clonedArray;
    }
    //exercise 10.10

    public static void swapTwoarrays(int[] array1, int[] array2){
        int sizeArr1 = array1.length;
        int sizeArr2 = array2.length;
        int[] saveArray = new int[sizeArr1];
        saveArray = copyOf(array1);

        if(sizeArr1 == sizeArr2){

            for(int i = 0; i < sizeArr1; i++){
                array1[i] = array2[i];
                array2[i] = saveArray[i];
            }

        }else{
            System.out.print("the arrays have not the same size, couldn't be swaped");
        }
    }

    public static void reverseArray(int[] array){
        int arraySize = array.length;
        int item1, item2, temp;

        print(array);
        for(int i = 0, j = arraySize-1; i < j; ++i, --j){
            item1 = array[i];
            item2 = array[j];
            array[i] = item2;
            array[j] = item1;
        }

        System.out.print(" reversed is: ");
        print(array);
    }

}
