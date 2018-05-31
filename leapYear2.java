import java.util.Scanner;
public class leapYear2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = input.nextInt();
        if(year %4==0) {
        if(year %100!=0){
        if(year %400==0) { 
            System.out.println("leap year!");
        }else {
        if (year %4==0)
            System.out.println("not a leap year");
        }
    }
}

}
}