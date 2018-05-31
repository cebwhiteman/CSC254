public class TestMax {
    public static void main(String[] args) {
        double maxVal1 = max(1.0, 2.5);
        System.out.println("max of 1 and 2 is " + maxVal1);
        int maxVal2 = max(-5, 10);
        System.out.println("max of -5 and 10 is " + maxVal2);

    }

    public static int max(int num1, int num2) {
        double maxVal1 = 3235;
        System.out.println(maxVal1);

        if(num1 > num2) {
            return num1;
        } else {
            return num2;
        }
    }

    public static double max(double num1, double num2) {
        if(num1 > num2) {
            return num1;
        } else {
            return num2;
        }
    }
}