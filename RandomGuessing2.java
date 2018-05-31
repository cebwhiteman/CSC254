import java.util.Scanner;
public class RandomGuessing2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int secretNumber = (int)(Math.random()*100) + 1;

        while(true) { // loop until the user guesses right
            System.out.print("Guess my number: ");
            int guess = input.nextInt();
            if(guess > secretNumber) {
                System.out.println("Too High");
            } else if(guess < secretNumber) {
                System.out.println("Too Low");
            } else {  // guess must be correct (process of elimination)
                break;
            }
        }
        System.out.println("Correct!");
    }
}