import java.util.Scanner;
public class RandomGuessing {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int secretNumber = (int)(Math.random()*100000) + 1;

        int guess = 0;
        while(guess != secretNumber) {
            System.out.print("Guess my number: ");
            guess = input.nextInt();
            if(guess > secretNumber) {
                System.out.println("Too High");
            } else if(guess < secretNumber) {
                System.out.println("Too Low");
            }
        }
        System.out.println("Correct!");
    }
}