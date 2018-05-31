import java.util.Scanner;
public class HexadecimalValues {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char c = input.next().charAt(0); 
        char score ='A';
        switch(score) {
        case 'A':
        System.out.println(10);
        break;
        case 'B':
        System.out.println(11);
        break;
        case 'C':
        System.out.println(112);
        break;
        case 'D':
        System.out.println(113);
        break;
        case 'E':
        System.out.println(114);
        break;
        case 'F':
        System.out.println(115);
        
        default:
        System.out.println("error");
        }
    }
}  