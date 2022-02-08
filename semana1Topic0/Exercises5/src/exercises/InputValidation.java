package exercises;

import java.util.Scanner;

public class InputValidation {

    public static void validate(){
        int numberIn;
        boolean isValid = false;
        Scanner scan = new Scanner(System.in);

        do{
            System.out.print("enter a number (between 0-10 or 90-100) > ");
            numberIn = scan.nextInt();
            if((numberIn >= 0 && numberIn <= 10) || (numberIn >= 90 && numberIn <= 100)){
                isValid = true;
            }else{
                System.out.print("enter a correct number\n");
            }
        }while(!isValid);

        System.out.print("\ngood");
    }
}
