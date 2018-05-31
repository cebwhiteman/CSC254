import java.util.Scanner;

/** CSC 184 - FA 17
 * Lab #8 Solution
 * Joseph Kendall-Morwick (Instructor)
 */
public class Lab8 {

    /** This program asks the user for a story (a single string), then for
     * a string of characters to count in the story. Finally, the program prints the
     * counts for each of the characters.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // read input from the console

        // ask the user for the "story"
        System.out.print("Tell me a story: ");
        String story = input.nextLine();

        // ask user for the characters to count in the story
        System.out.print("Enter some characters to count: ");
        String countMe = input.nextLine();

        for(int i=0; i<countMe.length(); i++) { // for each character we want to count...
            int total = 0; // will hold the total occurances of the i-th character we're counting
            for(int j=0; j<story.length(); j++) { // iterate through the story
                if(countMe.charAt(i) == story.charAt(j)) {
                    // we found an instance of the character we're counting
                    total++; // count it
                }
            }
            // inform the user how many times that character appeared in the story
            System.out.println("The character '"+countMe.charAt(i)+"' shows up " + total + " times.");
        }
    }
}