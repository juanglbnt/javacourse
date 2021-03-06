package excercises;

public class Excercises4 {

    final int UPPERBOUND = 100;
    final int LOWERBOUND = 1;
    final int NEWUPPERBOUND = 8899;
    final int NEWLOWERBOUND = 111;
    final int CHEKUPPERBOUND = 10;
    final int MAX_DENOMINATOR = 50000;

    public Excercises4(){}


    public void sumAverage(){
        int sum = 0;
        double average = 0.0;

        System.out.println("using for loop");

        for(int i = LOWERBOUND; i <= UPPERBOUND; i++){
            sum += i;
        }

        average = (double) sum / UPPERBOUND;
        System.out.println("the sum of " + LOWERBOUND + " to " + UPPERBOUND + " is: " + sum);
        System.out.println("the average is: " + average);
    }

    public void sumAverageUsingWhile(){
        int sum = 0;
        double average = 0.0;
        int counter = LOWERBOUND;

        System.out.println("\n----------------------------\nthis is using while loop");

        while(counter <= UPPERBOUND){
            sum += counter;
            counter++;
        }
        average = (double) sum / UPPERBOUND;
        System.out.println("the sum of " + LOWERBOUND + " to " + UPPERBOUND + " is: " + sum);
        System.out.println("the average is: " + average);
    }

    public void sumAverageUsingDoWhile(){
        int sum = 0;
        double average = 0.0;
        int counter = LOWERBOUND;

        System.out.println("\n----------------------------\nusing do-while loop");

        do{
            sum += counter;
            counter++;
        }while(counter <= UPPERBOUND);

        average = (double) sum / UPPERBOUND;
        System.out.println("the sum of " + LOWERBOUND + " to " + UPPERBOUND + " is: " + sum);
        System.out.println("the average is: " + average);
    }

    //calculate the sum and average in the range of 111 to 8899
    public void sumAverageRange(){
        int sum = 0;
        double average = 0.0;
        int count = 0;

        System.out.println("\n----------------------------\nfrom 111 to 8899");

        for (int i = NEWLOWERBOUND; i <= NEWUPPERBOUND; i++){
            sum += i;
            count++;
        }

        average = (double) sum / count;
        System.out.println("the sum of " + LOWERBOUND + " to " + UPPERBOUND + " is: " + sum);
        System.out.printf("the average is %f", average);
    }

    public void CalculateSumOddEven(){
        int sumOddNumbers = 0;
        int sumEvenNumbers = 0;
        int diffAbs = 0;

        System.out.println("\n----------------------------\nsum of odd and sum of even numbers");
        for(int i = LOWERBOUND; i <= UPPERBOUND; i++){
            if(i % 2 == 0){
                sumEvenNumbers += i;
            }else{
                sumOddNumbers += i;
            }
        }

        diffAbs = (sumEvenNumbers > sumOddNumbers) ?
                (sumEvenNumbers - sumOddNumbers) : (sumOddNumbers - sumEvenNumbers);

        System.out.println("sum of even numbers: " + sumEvenNumbers);
        System.out.println("sum of odd numbers: " + sumOddNumbers);
        System.out.println("absolute difference: " + diffAbs);
    }
}
