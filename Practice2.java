import java.util.Scanner;
public class Practice2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a first name and last name: ");
        String message = input.nextLine();
        boolean space = false;
        for (int i = 0; i < message.length(); i++) {
            if (message.charAt(i) == ' ') {
                space = true;
                System.out.println("First name: " + message.substring(0, i));
                System.out.println("Last name: " + message.substring(i + 1, message.length()));
            }
        }
        if (space == false) {
            System.out.println("Error: you didn't have a space in your name");
        }
    }
}
