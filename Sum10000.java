public class Sum10000 {
    public static void main(String[] args) {
        long sum = 0;
        long x = 0;
        for (long count = 0; count <= 10000; count++) {
            x = count + x;
        }
        sum = x;
        System.out.println(sum);
    }
}