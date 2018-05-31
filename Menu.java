import java.util.Scanner;
public class Menu {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Lab Gradebook Menu");
        boolean enterGrade = true; 
        // application stops when this is false

        String[] grades = new String[11]; 
        //creates an array to store all grades

        while (enterGrade) { // main loop
                System.out.println("");
                    System.out.println("Select an option: ");
                    System.out.println(" 1) Print all lab grades");
                    System.out.println(" 2) Enter a lab grade");
                    System.out.println(" 3) Calculate the overall lab score");
                    System.out.println(" 4) Quit");
                    System.out.print("\nSelection: ");
                    // print menu out to the user

                    String choice = input.next();
                    // read in response from the user
                    
                }
            }
        }