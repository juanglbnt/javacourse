package excercises;

public class Fibonacci {

    static int BOUND = 20;
    static int fnMinus1 = 0;
    static int fnMinus2 = 1;
    static int fn = fnMinus1 + fnMinus2;
    static int sum = 0;
    static double average;

    public static void printFibonacci(){
        System.out.printf("\n-----------------------\nFibonacci\n");
        System.out.print("\n" + 1 + " - " );
        for(int i = 2; i <= BOUND; i++){

            fn = fnMinus1 + fnMinus2;
            sum += fn;
            System.out.print(fn);
            fnMinus1 = fnMinus2;
            fnMinus2 = fn;

            if(i < 20){
                System.out.print(" - ");
            }
        }
        average = (double) sum / BOUND;
        System.out.println("\naverage = " + average);
    }
}
