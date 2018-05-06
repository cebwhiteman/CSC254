import java.util.Scanner;
public class CircleStats2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter a radius: ");
        double radius = input.nextDouble();
        if(radius >= 0) {
            System.out.print("The circumference is: ");
            System.out.println(2*Math.PI*radius);
            System.out.print("The area is: ");
            System.out.println(Math.PI*radius*radius);
        } else {
            System.out.println("enter a positive radius next time");
        }
    }
}