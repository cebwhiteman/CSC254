public class TellTime {
    public static void main(String[] args) {
        long minute = (System.currentTimeMillis() / (1000 * 60)) % 60;
        long hour = (System.currentTimeMillis() / (1000 * 60 * 60) - 5) % 12;
        System.out.print("hour: ");
        System.out.println(hour);
        System.out.print("minute: ");
        System.out.println(minute);
    }
}