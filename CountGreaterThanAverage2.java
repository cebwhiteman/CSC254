import java.util.Scanner;
public class CountGreaterThanAverage2 {
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
        for(int value : values) {
            total += value;
        }

        // divide the total by 100
        double average = total / 10.0;

        System.out.println("The values below are above the average value");
        // check each saved number to see if it's above the average
        for(double value : values) {
            // it == values[i]
            // if it is above the average, print it
            if(value > average) {
                System.out.println(value);
            }
        }
    }
}