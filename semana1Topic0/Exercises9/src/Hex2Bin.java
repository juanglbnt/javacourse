import java.util.Scanner;

public class Hex2Bin {
    final String[] HEX_BITS = {"0000", "0001", "0010", "0011",
            "0100", "0101", "0110", "0111",
            "1000", "1001", "1010", "1011",
            "1100", "1101", "1110", "1111"};
    Scanner scan = new Scanner(System.in);
    String hexString;

    public static void main(String[] args) {
        Hex2Bin hex2Bin = new Hex2Bin();

        System.out.print(hex2Bin.convertHexToBin(hex2Bin.getHexString()));

    }

    public String getHexString(){
        do{
            System.out.print("enter the hex number: ");
            hexString = scan.next();

            if(!validateHexString(hexString)){
                System.out.print("ENTER ONLY HEXADECIMAL NUMBER\n");
            }

        }while(!validateHexString(hexString));

        return hexString;
    }

    public boolean validateHexString(String hexString){
        String hexToValidate = hexString.toLowerCase();
        int strLength = hexToValidate.length();
        char currentChar;
        boolean isValid = true;

        for(int i = 0; i <= strLength-1; i++){
            currentChar = hexToValidate.charAt(i);
            if(!( (currentChar >= '0' && currentChar <= '9') ||
                    (currentChar >= 'a' && currentChar <= 'f'))){
                isValid = false;
                break;
            }
        }

        return isValid;
    }

    public String convertHexToBin(String hexString){
        String binaryCode = "";
        char actualChar;
        int number;//to extract the corresponding bit code
        String hexToConvert = hexString.toLowerCase().replace(" ", "");

        for(int i = 0; i < hexToConvert.length(); i++){
            actualChar = hexToConvert.charAt(i);

            switch(actualChar){
                case 'a':
                    number = 10;
                    break;
                case 'b':
                    number = 11;
                    break;
                case 'c':
                    number = 12;
                    break;
                case 'd':
                    number = 13;
                    break;
                case 'e':
                    number = 14;
                    break;
                case 'f':
                    number = 15;
                    break;
                default:
                    number = Character.getNumericValue(actualChar);
                    break;
            }

            binaryCode += HEX_BITS[number] + " ";

        }

        return binaryCode;
    }


}
