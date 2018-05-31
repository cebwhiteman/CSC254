import java.util.Scanner;
public class Project3 {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        boolean enterGrade = true; // application stops when this is false

        String[] grades = new String[11]; //creates an array to store all grades

        System.out.println("Lab Gradebook Menu");

        while (enterGrade) { // main loop

            System.out.println("");
            System.out.println("Select an option: ");
            System.out.println(" 1) Print all lab grades");
            System.out.println(" 2) Enter a lab grade");
            System.out.println(" 3) Calculate the overall lab score");
            System.out.println(" 4) Quit");
            System.out.print("\nSelection: ");
            // print menu out to the user


            int choice = input.nextInt();
            // read in response from the user

            switch (choice) {
                case 1: {    // prints all lab grades
                    //TODO create variable to hold lab grades entered
                    for (int i = 0; i < grades.length; i++) {
                        //grade creates a variable to store one individual grade, it will hold each grade
                        //one at a time each iteration through the loop

                        //if no grade is entered (empty array), it is null
                        //use an if statement to say if grade = null, print out no grade entered

                        String score = grades[i];
                        if (score == null) {
                            System.out.println("You have not entered a grade for lab " + (i + 1));
                        } else if (score.equals("N")) {
                            System.out.println("Lab #" + (i + 1) + ": N - 100.0");
                        } else if (score.equals("S+")) {
                            System.out.println("Lab #" + (i + 1) + ": S+ - 95.0");
                        } else if (score.equals("S")) {
                            System.out.println("Lab #" + (i + 1) + ": S - 90.0");
                        } else if (score.equals("S-")) {
                            System.out.println("Lab #" + (i + 1) + ": S- - 85.0");
                        } else if (score.equals("U")) {
                            System.out.println("Lab #" + (i + 1) + ": U - 70.0");
                        } else if (score.equals("NC")) {
                            System.out.println("Lab #" + (i + 1) + ": NC - 0.0");
                        } else {
                            System.out.println("That is not a valid entry");
                        }
                    }
                    //provides numerical equivalents of letter grades
                    // read and store 11 values from the user

                    break;

                }
                case 2: {

                    System.out.println("Which lab is this grade for?");
                    //ask user where to store grade in array
                    int labNumber = input.nextInt();

                    System.out.println("What is the grade?");
                    String gradeLetter = input.next();
                    //ask user to input grade


                    grades[labNumber - 1] = gradeLetter;
                    //sets gradeLetter equal to labNumber-1 because the array starts at position 0, not
                    //position 1, but the lab numbers start at 1, not 0



/*


                            int[] values = new int[11];
                            for (int i = 0; i < values.length; i++) {
                                values[i] = input.nextInt();
                            }

                            // add up the numbers
                            int total = 0;
                            for (int i = 0; i < values.length; i++) {
                                total += values[i];
                            }

                            // divide the total by the number of values entered
                            double average =


*/
                    break;

                }
                case 3: {
                    //convert from string grades to numerical scores
                    //write another method that takes grade in as a string

                    //TODO divide by number of values entered to find average
                    double totalGrade = 0;
                    int enteredGrades = 0;
                    int lowestScore = 101;
                    for (int i = 0; i < grades.length; i++) {
                        //grade creates a variable to store one individual grade, it will hold each grade
                        //one at a time each iteration through the loop

                        //if no grade is entered (empty array), it is null
                        //use an if statement to say if grade = null, print out no grade entered

                        String score = grades[i];
                        if (score == null) { //left blank  intentionally
                        } else if (score.equals("N")) {
                            totalGrade = (totalGrade + 100.0);
                            if(lowestScore > 100)
                                lowestScore = 100;
                            enteredGrades++; //enteredGrades++ counts the number of grades that are entered
                        } else if (score.equals("S+")) {
                            totalGrade = (totalGrade + 95.0);
                            if(lowestScore > 95)
                                lowestScore = 95;
                            enteredGrades++;
                        } else if (score.equals("S")) {
                            totalGrade = (totalGrade + 90.0);
                            if(lowestScore > 90)
                                lowestScore = 90;
                            enteredGrades++;
                        } else if (score.equals("S-")) {
                            totalGrade = (totalGrade + 85.0);
                            if(lowestScore > 85)
                                lowestScore = 85;
                            enteredGrades++;
                        } else if (score.equals("U")) {
                            totalGrade = (totalGrade + 70.0);
                            if(lowestScore > 70)
                                lowestScore = 70;
                            enteredGrades++;
                        } else if (score.equals("NC")) {
                            totalGrade = (totalGrade + 0.0);
                            if(lowestScore > 0)
                                lowestScore = 0;
                            enteredGrades++;
                        } else {
                            totalGrade = (totalGrade + 0.0);
                        }
                    }

                            double averagedGrade = enteredGrades > 1 ?
                                    (totalGrade - lowestScore) / (enteredGrades -1) :
                                    totalGrade / enteredGrades;

                            // prints out average of values entered

                            //TODO make this divide by the number of values entered,

                            System.out.println("Your average grade is: " + averagedGrade);
                        break;

                }

                case 4: {
                    enterGrade = false;
                    System.out.println("Goodbye!");

                break;
                }

                default: {
                    System.out.print("Invalid entry");
                    //TODO return to main menu
                }

            }
        }

    }
}
