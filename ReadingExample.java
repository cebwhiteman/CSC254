import java.util.Scanner;

public class ReadingExample {
  public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter a value: ");
      double val = input.nextDouble();
      System.out.print("You entered: ");
      System.out.println(val);
  }
}