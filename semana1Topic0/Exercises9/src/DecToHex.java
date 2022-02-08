import java.util.InputMismatchException;
import java.util.Scanner;

public class DecToHex {
    Scanner in = new Scanner(System.in);
    int inDecimal;

    public static void main(String[] args) {
        DecToHex decToHex = new DecToHex();
        decToHex.getHex();

    }

    public void getHex(){
        int decimal = 0;
        String entry;
        int mod = 0;
        String mods = "";
        String numbers = "";

        do{
            System.out.print("enter the number: ");
            entry = in.next();
            if(!isNum(entry)){
                System.out.print("ONLY NUMBERS\n");
            }
        }while(!isNum(entry));

        decimal = Integer.parseInt(entry);

        do{
            mod = (decimal % 16);

            switch(mod){
                case 10:
                    mods += "A";
                    break;
                case 11:
                    mods += "B";
                    break;
                case 12:
                    mods += "C";
                    break;
                case 13:
                    mods += "D";
                    break;
                case 14:
                    mods += "E";
                    break;
                case 15:
                    mods += "F";
                    break;
                default:
                    mods += mod+"";
            }

            decimal /= 16;

        }while(decimal > 1 || decimal > 0);

        System.out.print("the hexadecimal is: ");
        for(int i = mods.length()-1; i >= 0; i--){
            System.out.print(mods.charAt(i));
        }

    }

    public boolean isNum(String num){
        try{
            Integer.parseInt(num);
            return true;
        }catch (NumberFormatException e){
            return false;
        }
    }

}
