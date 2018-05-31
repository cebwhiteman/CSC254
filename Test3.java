import java.util.Scanner;
public class Test3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a first name and last name: ");
        String fullName = input.nextLine();

        String firstName = fullName.substring(0, fullName.indexOf(" "));
        System.out.println("Your first name is: " + firstName);

        String lastName = fullName.substring(fullName.indexOf(" ") + 1);
        System.out.println("Your last name is: " + lastName);
    }

}

