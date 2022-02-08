package excercises;

public class ComputePI {
    static final int MAX_DENOMINATOR = 100000;
    static double sum = 0.0;
    public static double PI = 0.0;
    public static double comparision = 0.0;

    public static void calculatePI(){
        System.out.println("\n----------------------------\ncompute PI");

        for(int denominator = 1; denominator <= MAX_DENOMINATOR; denominator+=2){

            if(denominator % 4 == 1){
                sum += (double) 1 / denominator;
            }else if(denominator % 4 == 3){
                sum -= (double) 1 / denominator;
            }else{
                System.out.println("impossible");
            }
        }

        PI = 4 * sum;
        System.out.println("PI = " + PI);
        comparision = (PI / Math.PI) * 100;
        System.out.println("PI comparision = " + comparision);
    }

}
