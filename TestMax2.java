public class TestMax2 {
    public static void main(String[] args) {
        double maxVal1 = max(1.0, 2.5, 99.9, 403);
        System.out.println("max of 1 and 2 is " + maxVal1);
        int maxVal2 = max(-5, -1, -9);
        System.out.println("max of -5 and 10 is " + maxVal2);
    }

    public static int max(int ... values) {
        int max = Integer.MIN_VALUE;
        for(int value : values) {
            if(value > max) {
                max = value;
            }
        }
        return max;
    }

    public static double max(double ... values) {
        double max = Double.MIN_VALUE;
        for(double value : values) {
            if(value > max) {
                max = value;
            }
        }
        return max;
    }

}