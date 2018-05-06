public class CodingBatWeek4 {
    public static boolean sleepIn(boolean weekday, boolean vacation) {
        return !weekday || vacation;
    }
    
    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        return !(aSmile ^ bSmile);
    }

    public static int diff21(int n) {
        int diff = Math.abs(n - 21);
        if( n > 21) {
            diff = diff * 2;
        }
        return diff;
    }

}