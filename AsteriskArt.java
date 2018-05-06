public class AsteriskArt {
    public static void main(String[] args) {
        int shapeSize = 5;

        // draw a rectangle
        for(int row=1; row <=shapeSize; row++) {
            for(int col=1; col <=shapeSize; col++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        System.out.println("\n\n");

        // draw a right-triangle
        for(int row=1; row <=shapeSize; row++) {
            for(int col=1; col <= row; col++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        System.out.println("\n\n");

        // draw an isosceles triangle
        for(int row=1; row <=shapeSize; row++) {

            // print spaces
            for(int col=1; col <= shapeSize - row; col++) {
                System.out.print(" ");
            }

            // print double the asterisks
            for(int col=1; col <= 2*row -1 ; col++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}