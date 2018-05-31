public class IsoTriangle {
    public static void main(String[] args) {
        int shapeSize = 5;
        //draw an isosceles triangle
        for (int row = 1; row <= shapeSize; row++) {
            //print spaces
            for (int col = 1; col <= shapeSize - row; col++) {
                System.out.print(" ");
            }
            //print double the asterisks
            for (int col = 1; col <= 2*row-1; col++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}