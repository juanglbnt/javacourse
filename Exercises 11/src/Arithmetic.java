import java.util.Scanner;

public class Arithmetic {

    public static void main(String[] args) {
        int operand1, operand2;
        char operator;

        if(args.length != 3){
            System.err.println("Usage: java arithmetic int1 int2 operator");
            return;
        }

        operand1 = Integer.parseInt(args[0]);
        operand2 = Integer.parseInt(args[1]);
        operator = args[2].charAt(0);

        switch(operator){
            case '+':
                System.out.println(operand1 + operand2);
                break;
            case '-':
                System.out.println(operand1 - operand2);
                break;
            case '*':
                System.out.println(operand1 * operand2);
                break;
            case '/':
                System.out.println(operand1 / operand2);
            default:
                System.err.println("Error: invalid operator");
        }
    }
}

