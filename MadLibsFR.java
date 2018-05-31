import java.util.Scanner;
public class MadLibsFR {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Saisissez un adjectif: ");
        String question1 = input.nextLine();
        System.out.print("Saisissez un nom: ");
        String question2 = input.nextLine();
        System.out.print("Saisissez le nom d'un animal: ");
        String question3 = input.nextLine();
        System.out.print("Saisissez un bruit: ");
        String question4 = input.nextLine();
        System.out.println(question1 + " Macdonald avait un(e) " + question2 + ", " + " E-I-E-I-O");
        System.out.println("et sur ce/cet/cette " + question2 + " il avait un(e) " + question3 + ", E-I-E-I-O");
        System.out.println("avec un(e) " + question4 + "! " + question4 + "! " + "ici");
        System.out.println("et un(e) " + question4 + "! " + question4 + "! " + "là,");
        System.out.println("partout un(e) " + question4 + "! " + question4 + "! ");
        System.out.println(question1 + " Macdonald avait un(e) " + question2 + ", " + " E-I-E-I-O");
    }
}
