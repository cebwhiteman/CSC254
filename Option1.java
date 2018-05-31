import java.util.Scanner;
public class Option1 {

    //input is string, output is int
    //write a method here
    
    public static void main(String[] args) {

                Scanner input = new Scanner(System.in);
                boolean enterGrade = true; // application stops when this is false

                String[] grades = new String[11]; //creates an array to store all grades
                grades[0]="S";
                System.out.println("Lab Gradebook Menu");
                
                while (enterGrade) { // main loop

                    System.out.println("");
                    System.out.println("Select an option: ");
                    System.out.println(" 1) Print all lab grades");
                    System.out.println(" 2) Enter a lab grade");
                    System.out.println(" 3) Calculate the overall lab score");
                    System.out.println(" 4) Quit");
                    System.out.print("\nSelection: ");
                    
                    
                    
                    String choice = input.next();
                    
                    switch (choice){
                        case "1": {    // prints all lab grades
                            //TODO create variable to hold lab grades entered
                            int ii = 0;
                            for(String grade : grades){
                                //grade creates a variable to store one individual 
                                //grade, it will hold each grade one at a time each
                                //iteration through the loop

                                if (grade == null){
                                 System.out.println("No grade entered for lab #" + Integer.toString(ii+1));
                                }
                                else{
                                 System.out.println("Lab #"+ Integer.toString(ii+1)+":" + grade);
                                }
                                 ii++;
                                 

                                
                            }

                    }
                    
                    
            }
    
        }
        
        }
    }
    