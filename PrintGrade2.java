import java.util.Scanner;
public class PrintGrade2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter grade: ");
        double grade=input.nextDouble();
        if (grade>=90){
            System.out.println("A");
        } if (grade>=80 && grade<90){
            System.out.println("B");
        } if (grade>=70 && grade<80){ 
            System.out.println("C");
        } if (grade>=60 && grade<70){
            System.out.println("D");
        } else if (grade<60){
            System.out.println("F");
        }
    }
}
