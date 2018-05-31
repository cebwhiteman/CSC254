import java.util.Scanner;

public class ChooseGroups {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Press enter to select a random student");
        while(!input.nextLine().equals("quit"))
        switch((int)(Math.random()*12)) {
            case 1:
                System.out.println("Caroline");
                break;
            case 2:
                System.out.println("Corey");
                break;
            case 3:
                System.out.println("Deon");
                break;
            case 4:
                System.out.println("Devin M");
                break;
            case 5:
                System.out.println("Devin K");
                break;
            case 6:
                System.out.println("Jacob");
                break;
            case 7:
                System.out.println("Jon");
                break;
            case 8:
                System.out.println("Josue");
                break;
            case 9:
                System.out.println("Kelly");
                break;
            case 10:
                System.out.println("Kels");
                break;
            case 11:
                System.out.println("Noah");
                break;
            case 12:
                System.out.println("Sarah");
                break;
            case 13:
                System.out.println("Tristan");
                break;
        }
    }
}