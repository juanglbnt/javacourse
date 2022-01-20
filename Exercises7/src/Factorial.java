public class Factorial {

    /*fixed:
    * we need long variable to store a bigger number
    */

    public static void main(String[] args){
        int number = 20;
        long factorial = 1;

        for(int i = 1; i <= number; i++){
            factorial *= i;
        }

        System.out.println("the factorial of " + number + " is: " + factorial);
    }
}
