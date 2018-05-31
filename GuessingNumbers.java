import java.util.Scanner;
public class GuessingNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int secretNumber = (int)(Math.random() * 100)+1;
        int guess = 0;
        while (guess != secretNumber) {
    System.out.print("Guess a number: ");
    guess = input.nextInt();
    if(guess> secretNumber) {
        System.out.println("Too high!");
    } else if(guess < secretNumber) {
        System.out.println("Too low!");
    }
        }
        System.out.println("Correct!");
    }

}
