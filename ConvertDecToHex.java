import java.util.Scanner;

public class ConvertDecToHex {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer value: ");
        String hexStr = "";

        for(int x = input.nextInt(); x != 0; x /= 16) {
            int digit = x % 16; // extract the least significant digit

            // convert it to hex
            if(digit < 10) {
                hexStr = digit + hexStr;
            } else {
                hexStr = (char)('A' + (digit - 10)) + hexStr;
            }
        }

        System.out.println("That number in hex: " + hexStr);
    }
}