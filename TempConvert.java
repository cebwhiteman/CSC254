import java.util.Scanner;
public class TempConvert {
    public static void main (String[] args) {
    Scanner input=new Scanner(System.in);
    System.out.print("enter a temp in Celsius:");
    double c=input.nextDouble();
    double f = (9.0/5.0)*c+32;
    System.out.println(f);
    System.out.print("enter a temp in Fahrenheit:");
    double ff=input.nextDouble();
    double cc = (5.0/9.0)*(ff-32);
    System.out.println(cc);
    
    }
}
