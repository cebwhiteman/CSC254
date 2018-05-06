import java.util.Scanner;
public class CircleStats {
    public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    double radius=input.nextDouble();
    System.out.print("The circumference is:");
    System.out.println(2*3.14*radius);
    System.out.print("The area is:");
    System.out.println(3.14*radius*radius);
    }
}
