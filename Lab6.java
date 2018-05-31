import java.util.Scanner;
public class Lab6 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter an adjective: ");
        String question1 = input.nextLine();
        System.out.print("Enter a noun: ");
        String question2 = input.nextLine();
        System.out.print("Enter an animal: ");
        String question3 = input.nextLine();
        System.out.print("Enter a noise: ");
        String question4 = input.nextLine();
        System.out.println(question1 + " Macdonald had a " + question2 + ", " + " E-I-E-I-O");
        System.out.println("and on that " + question2 + " he had a " + question3 + ", E-I-E-I-O");
        System.out.println("with a " + question4 + "! " + question4 + "! " + "here");
        System.out.println("and a " + question4 + "! " + question4 + "! " + "there,");
        System.out.println("everywhere a " + question4 + "! " + question4 + "! ");
        System.out.println(question1 + " Macdonald had a " + question2 + ", " + " E-I-E-I-O");
    }
}
