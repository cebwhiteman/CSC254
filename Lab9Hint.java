import java.util.Scanner;
public class Lab9Hint {

    public static boolean checkPalindrome(String word) {
        return false; // TODO: finish this
    }

    public static int countUms(String story) {
        int count = 0; // the number of um's found

        // check each position in the string except the last position
        //  (otherwise we'll go over the length of the string when pulling
        //   out a 2-character substring)
        for(int i=0; i < story.length() - 1; i++) {
            // if we find an um at position i....
            if(story.substring(i,i+3).equalsIgnoreCase("um")) {
                count++; // increase the count by one
            }
        }

        return count;  // return the number of um's that we found
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a sentence without spaces: ");
        String response = input.nextLine().trim();


        /*
        boolean isPalindrome = true;

        for(int i=0; i < response.length()/2;  i++) {
            if(response.charAt(i) != response.charAt(response.length() - 1 - i)) {
                isPalindrome = false;
            }
        }
        */

        if(checkPalindrome(response)) {
            System.out.println("You entered a palindrome!");
        } else {
            System.out.println("You did not enter a palindrome");
        }

        System.out.println("Your string also had " + countUms(response) + " ums in it.");
    }
}