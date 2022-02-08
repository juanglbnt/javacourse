package excercises;

public class HarmonicSum {

    static final int MAX_DENOMINATOR = 50000;

    public static void calculateHarmonicSum(){
        double sumL2R = 0.0;
        double sumR2L = 0.0;
        double absDiff = 0.0;

        System.out.println("\n----------------------------\nHARMONIC");

        //left to right
        for(int denominator = 1; denominator <= MAX_DENOMINATOR; denominator++){
            sumL2R += (double) 1 / denominator;
        }
        System.out.println("sum left to right = " + sumL2R);

        //right to left
        for(int denominator = MAX_DENOMINATOR; denominator >= 1; denominator--){
            sumR2L += (double) 1 / denominator;
        }

        //absolut difference
        absDiff = (sumL2R > sumR2L) ? (sumL2R - sumR2L) : (sumR2L - sumL2R);

        System.out.println("sum right to left = " + sumR2L);
        System.out.println("diference: " + absDiff);
    }
}
