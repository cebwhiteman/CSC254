public class TestCodingBat {
    public static boolean sleepIn(boolean weekday, boolean vacation) {
        if (!weekday || vacation) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println("sleepIn(false, false) → true\t" +
                sleepIn(false, false));
    }
}