package excercises;

public class ExtractDigits {

    static int n = 12345;
    static int backup = n;

    public static void ExtractInReverse(){

        System.out.println(backup + " in reverse: ");
        while(n > 0){
            int digit = n % 10;
            System.out.print(digit + " ");
            n = n /10;
        }
    }
}
