import java.util.Scanner;
public class Test5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a first name and a last name: ");
        String message = input.nextLine();
        int spaceLocation = message.indexOf(" ");
        if(spaceLocation != -1) {
        System.out.println("Your first name is: " + message.substring(0, spaceLocation));
        System.out.println("Your last name is: " + message.substring(spaceLocation + 1, message.length()));
        } else {
            System.out.println("Error: you didn't have a space in your name");
        }
    }
}