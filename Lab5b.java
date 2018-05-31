import java.util.Scanner;
public class Lab5b {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char c = input.next().charAt(0);
        switch(c) {
            case '0':
            case '1':
            case '2': 
            case '3':
            case '4':
            case '5':
            case '6':
            case '7':
            case '8':
            case '9':
        System.out.println(c);
        break;     
            case 'A':
            case 'a':
        System.out.println(10);
        break;
            case 'B':
            case 'b':
        System.out.println(11);
        break;
            case 'C':
            case 'c':
        System.out.println(12);
        break;
            case 'D':
            case 'd':
        System.out.println(13);
        break;
            case 'E':
            case 'e':
        System.out.println(14);
        break;
            case 'F':
            case 'f':
        System.out.println(15);
        
        default:
        System.out.println("error");
        }
    }
}  