import java.util.Scanner;
public class DivisibleIntegers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter an integer: ");
        int a = input.nextInt();
        System.out.print("enter another integer: ");
        int b =  input.nextInt();
        if (a%b==0){
            System.out.println("the first integer is divisible by the second");
        } else if (b%a==0){
            System.out.println("the second integer is divisible by the first");
        } else if (a%b != 0 && b%a != 0){
            System.out.println("neither integer is divisible by the other");
        }
    }
}
