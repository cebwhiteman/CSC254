import java.util.Scanner;

public class ConvertHexToDec {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a hex value: ");
        String hexStr = input.next(); // input in hex from user

        int base = 1; // the base value for each digit
        int convertedDecValue = 0;  // eventual decimal value of user input

        // start at least significant digit from user, move to the left
        for(int i=hexStr.length()-1; i >= 0 ; i--) {
            char hexDigit = hexStr.charAt(i);

            // convert hex digit to its decimal value
            int decDigitValue;
            if(hexDigit >= '0' && hexDigit <= '9' ) {
                decDigitValue = (hexDigit - '0');
            } else {
                decDigitValue = (hexDigit - 'A' + 10);
            }

            // add to total decimal value
            convertedDecValue += decDigitValue * base;

            // increase base by factor of 16
            base *= 16;
        }

        System.out.println("That number in decimal: " + convertedDecValue);
    }
}