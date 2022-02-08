package excercises;

public class SumOddEven {
    static int sum;
    static final int LOWERBOUND = 1;
    static final int UPPERBOUND = 100;
    static final int CHEKUPPERBOUND = 5;

    public static void CalculateSumOddEven(){
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
