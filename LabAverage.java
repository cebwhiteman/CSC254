import java.util.Scanner;

public class LabAverage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int total = 0;          // total lab score
        int numberOfLabs = 0;   // number of lab grades

        while(true) { // until user types quit...
            // ask for a value from the user
            System.out.print("Enter a lab score (type quit to get average): ");
            String line = input.nextLine();
            if(line.equals("quit")) { //quit if user types quit
                break;
            }
            // add it to a total lab score
            total += Integer.parseInt(line);
            numberOfLabs++;

        }
        // print out the average lab score
        System.out.println(total / numberOfLabs);
    }
}