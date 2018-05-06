import java.util.Scanner;

public class ConvertTemp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter a temp in celsius: ");
        double c = input.nextDouble();
        
        double f = (9.0/5.0)*c + 32;
        System.out.print("temp in farenheight: ");
        System.out.println(f);
    }
}