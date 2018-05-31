//Lab for Caroline Whiteman and Noah Jones//
import java.util.Scanner;
public class Lab2 {
    public static void main(String[] args) {
      Scanner input=new Scanner(System.in);
      System.out.print("The integer is:");
      int x=input.nextInt();
      System.out.print("The divisor is:");
      int y=input.nextInt();
      System.out.print("The answer is:");
      System.out.println(x/y);
      System.out.print("The remainder is:");
      System.out.println(x%y); 
     }
}
