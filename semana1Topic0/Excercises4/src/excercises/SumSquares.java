package excercises;

public class SumSquares {

    static int sum;
    static final int LOWERBOUND = 1;
    static final int UPPERBOUND = 100;
    static final int CHEKUPPERBOUND = 5;

    public static void calculateSumSquares(){

        System.out.println("\n----------------------------\nsum of the squares from 1 to 100");
        for(int i = LOWERBOUND; i <= UPPERBOUND; i++){
            sum += (i * i);
        }
        System.out.println("the sum of squares is: " + sum);
    }
}
