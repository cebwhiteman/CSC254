public class AsteriskArt2 {
    public static void drawRectangle(int width, int height) {
        for(int row=1; row <=width; row++) {
            for(int col=1; col <=height; col++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println("\n\n");
    }

    public static void drawSquare(int size) {
        drawRectangle(size, size);
    }

    public static void drawRightTriangle(int size) {

        for(int row=1; row <=size; row++) {
            for(int col=1; col <= row; col++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println("\n\n");
    }

    public static void main(String[] args) {
        // draw a rectangle
        drawSquare(5);

        // draw a right-triangle
        drawRightTriangle(5);
    }
}