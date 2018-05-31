import java.util.Scanner;
public class Lab9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a word: "); //prompts user to enter a word
        String word = input.nextLine();

        boolean palindromeDetected = true; //creates a boolean called palindromeDetected and sets it to true

        // TODO: check to see if it is not a palindrome
        for (int i = 0; i < word.length(); i++) {
            //goes through word, beginning at index 0 and ending at the last character
            if (word.charAt(i) != word.charAt(word.length() - (i + 1))) {
                //if the character at index i is not the same as the character at word length minus i + 1
                palindromeDetected = false; //return false
            }
        }

        if (checkPalindrome(word)) {
            System.out.println(word + " is a palindrome!");
            //if user has entered a palindrome, inform user
        } else {
            System.out.println(word + " is not a palindrome!");
            //if user did not enter a palindrome, inform user
        }
        System.out.println("Number of ums in your word: " + countUms(word));
        //informs user of number of ums found
    }


    public static boolean checkPalindrome(String word) {
        word = word.toLowerCase(); //makes all characters in String "word" lower case
        boolean checkPalindrome = true;
        for (int i = 0; i < word.length(); i++) { //goes through each character of the word
            if (word.charAt(i) != word.charAt(word.length() - (i + 1))) {
                //if the character on the left and its mirror image on the right are the not the same, inform user
                return false;
            }

        }
        return true;
    }


    public static int countUms(String story) {
        story = story.toLowerCase(); //makes all the characters in String "story" lower case
        int totalUms = 0; //creates a variable to store the total number of ums
        for (int i = 0; i < story.length() - 1; i++) {
            //goes through word, beginning at index 0 and ending at the last character
            if (story.charAt(i) == 'u' && (story.charAt(i + 1)) == 'm') {
                //if at index i is 'u' and the character at the following index (i + 1) is 'm'
                totalUms++;
                //increase total number of ums by one

            }

        }
        return totalUms; //returns total number of ums
    }
}

