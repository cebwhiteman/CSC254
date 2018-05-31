/** CSC 184 - FA 17
 * Lab #7 Solution
 * Joseph Kendall-Morwick (Instructor)
 */

public class Lab7 {

    /** Takes an arbitrary string, removes all characters consisting of vowels from it, and returns the result.
     * Y is always treated as a vowel for simplicity.
     */
    public static String noVowels(String sentence) {
        String newSentence = ""; // will hold the resulting string
        for(int i=0; i < sentence.length(); i++) { // iterate through each character in the string

            // if it's not a vowel ...
            if(Character.toUpperCase(sentence.charAt(i)) != 'A' &&
                    Character.toUpperCase(sentence.charAt(i)) != 'A' &&
                    Character.toUpperCase(sentence.charAt(i)) != 'E' &&
                    Character.toUpperCase(sentence.charAt(i)) != 'I' &&
                    Character.toUpperCase(sentence.charAt(i)) != 'O' &&
                    Character.toUpperCase(sentence.charAt(i)) != 'U' &&
                    Character.toUpperCase(sentence.charAt(i)) != 'Y') {
                newSentence += sentence.charAt(i);  // .. then tack it on to our result
            }
        }
        return newSentence; // return the result with no vowels
    }

    /** Runs some tests for the noVowel method */
    public static void main(String[] args) {
        String sentence;
        sentence = "Frankly, my dear, I don't give a damn.";
        System.out.println(sentence);
        System.out.println(noVowels(sentence));
        sentence = "I'm gonna make him an offer he can't refuse.";
        System.out.println(sentence);
        System.out.println(noVowels(sentence));
        sentence = "Toto, I've a feeling we're not in Kansas anymore.";
        System.out.println(sentence);
        System.out.println(noVowels(sentence));
        sentence = "Here's looking at you, kid.";
        System.out.println(sentence);
        System.out.println(noVowels(sentence));
        sentence = "Go ahead, make my day.";
        System.out.println(sentence);
        System.out.println(noVowels(sentence));
        sentence = "All right, Mr. DeMille, I'm ready for my close-up.";
        System.out.println(sentence);
        System.out.println(noVowels(sentence));
        sentence = "May the Force be with you.";
        System.out.println(sentence);
        System.out.println(noVowels(sentence));
        sentence = "You talking to me?";
        System.out.println(sentence);
        System.out.println(noVowels(sentence));
        sentence = "What we've got here is failure to communicate.";
        System.out.println(sentence);
        System.out.println(noVowels(sentence));
        sentence = "I love the smell of napalm in the morning.";
        System.out.println(sentence);
        System.out.println(noVowels(sentence));
        sentence = "Fasten your seatbelts. It's going to be a bumpy night.";
        System.out.println(sentence);
        System.out.println(noVowels(sentence));
    }
}