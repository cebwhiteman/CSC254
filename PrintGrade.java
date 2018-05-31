import java.util.Scanner;
public class PrintGrade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter grade: ");
        double grade = input.nextDouble();
        
        if(grade >= 90) {
            System.out.println("A");
        } else if(grade >= 80) {
            System.out.println("B");
        } else if(grade >= 70) {
            System.out.println("C");
        } else if(grade >= 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }
    }
}