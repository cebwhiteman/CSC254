import java.util.Scanner;
public class Week13 {
        public static void main(String[] args){
            int[] values = new int[10];
            Scanner input = new Scanner(System.in);
            //read and store ten values from the user
            System.out.print("Enter 10 integer values below: ");
            for(int i = 0; i < values.length; i++) {
                values[i] = input.nextInt();
            }
            //add up the numbers
            int total = 0;
            for(int value : values){
                total += value;
            }
            //divide the total by 10
            double average = total / 10.0;
            //check each saved number to see if it is above the average
            for(int value : values) {
                //if it is above the average, print it
                if(value > average){
                    System.out.println(value);
                }
            }
        }
    }
