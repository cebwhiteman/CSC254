public class Lab7Help {


    public static void main(String[] args) {
        String test1 = "Frankly, my dear, I don't give a damn.";
        String result1 = "Frnkl, m dr, dn't gv dmn.";
        System.out.println("before:  " + test1);
        System.out.println("after: " + noVowels(test1));
        System.out.println("expected: " + result1);
        if(noVowels(test1).equals(result1))
            System.out.println("test passed!");
        else System.out.println("test failed");
        if(noVowels("I'm gonna make him an offer he can't refuse.")
            .equals("'m gnn mk hm n ffr h cn't rfs."))
            System.out.println("test passed!");
        else System.out.println("test failed");
        if(noVowels("Toto, I've a feeling we're not in Kansas anymore.")
        .equals("Tt, 'v flng w'r nt n Knss nmr."))
            System.out.println("test passed!");
        else System.out.println("test failed");
    }

    public static String noVowels(String sentence) {
        String acc = "";
        for(int i=0; i < sentence.length(); i++) {
            if(Character.toLowerCase(sentence.charAt(i)) != 'i') {
                acc += sentence.charAt(i);
            }
        }
        return acc;
    }
}