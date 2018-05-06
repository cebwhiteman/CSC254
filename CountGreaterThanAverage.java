import java.util.Scanner;
public class CountGreaterThanAverage {
    public static void main(String[] args) {
        int[] values = new int[10];
        Scanner input = new Scanner(System.in);

        // read and store 10 values from the user
        System.out.println("Enter 10 integer values below");
        for(int i=0; i < values.length; i++) {
            values[i] = input.nextInt();
        }

        // add up the numbers
        int total = 0;
        for(int i=0; i < values.length; i++) {
            total += values[i];
        }

        // divide the total by 100
        double average = total / 10.0;

        System.out.println("The values below are above the average value");
        // check each saved number to see if it's above the average
        for(int i=0; i < values.length; i++) {
            // it == values[i]
            // if it is above the average, print it
            if(values[i] > average) {
                System.out.println(values[i]);
            }
        }
    }
}