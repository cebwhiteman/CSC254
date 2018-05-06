import java.util.Scanner;
public class BMI {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter BMI: ");
        double BMI=input.nextDouble();
        if (BMI<18.5){
            System.out.println("underweight");
        } else if (BMI<25){
            System.out.println("normal");
        } else if (BMI<30){ 
            System.out.println("overweight");
        } else 
            System.out.println("obese");
        }
    }

