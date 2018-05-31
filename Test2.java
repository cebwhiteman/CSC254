import java.util.Scanner;
public class Test2 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter a message: ");
            String message = input.nextLine();
            for(int i=0; i<message.length()-1; i++) {
                if(message.charAt(i) == message.charAt(i+1)) {
                    System.out.println("repeated character at position " + i);
                }
            }
        }
    }
