import com.juan.topic3.challenge.Exercise1;
import com.juan.topic3.challenge.Exercise2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Exercise2 ex2 = new Exercise2();
        Exercise1 ex1 = new Exercise1();

        Double result = ex1.expansionImperative(20.00);
        System.out.printf("%.4f", result);
        System.out.println("\nfactorial: " + ex1.factorial(3));

    }
}
