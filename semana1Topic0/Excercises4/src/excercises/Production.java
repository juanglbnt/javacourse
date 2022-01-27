package excercises;

public class Production {

    static long product = 1;
    public static final int NUMBER = 13;

    public static void calculateProduction(){
        System.out.println("\n----------------------------\nfactorial");

        for(int i = 1; i <= NUMBER; i++){
            product *= i;
        }

        System.out.println("factorial of " + NUMBER + " = "  + product);
    }
}
