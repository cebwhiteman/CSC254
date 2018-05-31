public class Lab3 {
    public static void main(String[] args) {
        double x = 3.0;
        double mean = 5.0;
        double standardDeviation =2.0;
        System.out.println(
            (1 / (Math.sqrt(2 * Math.PI * Math.pow(standardDeviation, 2))) *
            Math.pow(Math.E, 
              - Math.pow(x-mean, 2) / 
              (2 * Math.pow(standardDeviation, 2)))));
    }
}