public class DinnerBill {
    public static void main (String[] args) {
        double bill=67.30;
        int dollars=(int)(bill/3);
        int cents=(int)(bill/3*100+0.5)%100;
        //converts dollars to cents and rounds to nearest cent//
        System.out.print("Each person owes: ");
        System.out.print(dollars);
        System.out.print(" dollars and ");
        System.out.print(cents);
        System.out.println(" cents ");
        
    }
}
