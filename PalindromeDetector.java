import java.util.Scanner;

public class PalindromeDetector {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a word: " );
        String word = input.nextLine();

        boolean palindromeDetected = true;

        // TODO: check to see if it is not a palindrome
        for(int i=0;  i < word.length();  i++) {
            if (word.charAt(i) !=  word.charAt(word.length() - (i+1))){
                palindromeDetected = false;
            }
        }

        if(palindromeDetected) {
            System.out.println(word + " is a palindrome!");
        } else {
            System.out.println(word + " is not a palindrome!");
        }
    }
}