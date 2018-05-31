import java.util.Scanner;
public class Practice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a first name and last name: ");
        String message = input.nextLine();
        String firstName;
        String lastName;
        for (int i = 0; i < message.length() - 1; i++) { //goes through each character in string
            if (message.contains(" ")) {
                message = message.substring(0, message.indexOf(" "));
                System.out.print("Your first name is: " + message);
            }
        }
    }
}