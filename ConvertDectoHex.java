import java.util.Scanner;

public class ConvertDectoHex {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer value: ");
        int x = input.nextInt();
        String hexStr = "";

        while(x!=0) {
            int digit = x % 16;
            hexStr = digit < 10 ?
                digit + hexStr:
                hexStr + (char) ('A' + (digit - 10));
            x = x / 16;
    }
     System.out.println("That number in hex is: " + hexStr);
    }
}