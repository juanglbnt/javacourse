package excercises;

public class SumAverageRunningInt {

    final int UPPERBOUND = 100;
    final int LOWERBOUND = 1;
    int sum = 0;
    double average;

    public SumAverageRunningInt(){}


    public void sumAverage(){

        for(int i = LOWERBOUND; i <= UPPERBOUND; i++){
            sum += i;
        }

        average = (double) sum / UPPERBOUND;
        System.out.println("the sum of " + LOWERBOUND + " to " + UPPERBOUND + " is: " + sum);
        System.out.println("the average is: " + average);
    }

}
