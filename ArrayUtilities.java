public class ArrayUtilities {
    public static void main(String[] args) {
        int[] values = new int[10];

        // intialize the array to random values
        for(int i=0; i < values.length; i++) {
            values[i] = (int)(Math.random()*100);
        }

        // print out the values in the array
        System.out.print("values in the array: ");
        for(int i=0; i < values.length; i++) {
            System.out.print(values[i] + " ");
        }

        // find the sum of the values in the array
        int total = 0;
        for(int i=0; i < values.length; i++) {
            total += values[i];
        }
        System.out.println("\nThe total is: " + total);

        // find the largest element and the first index it's stored at
        int max = values[0];
        int firstIndexOfMax = 0;
        for(int i=1; i < values.length; i++) {
            if(max < values[i]) {
                max = values[i];
                firstIndexOfMax = i;
            }
        }
        System.out.println("The maximum value is: " + max);
        System.out.println("The first index of the maximum value is: " +
                firstIndexOfMax);
    }
}