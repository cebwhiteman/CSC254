import java.util.Scanner;
public class Magic8BallLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String question="";
        while(true) { //loop until user enters "quit"
            System.out.print("What is your question?");
            switch ((int) (Math.random() * 17)) {
                case 0:
                    System.out.println("My sources say no");
                    break;
                case 1:
                    System.out.println("Outlook not so good");
                    break;
                case 2:
                    System.out.println("It is certain");
                    break;
                case 3:
                    System.out.println("My answer is no");
                    break;
                case 4:
                    System.out.println("It is decidedly so");
                    break;
                case 5:
                    System.out.println("Without a doubt");
                    break;
                case 6:
                    System.out.println("Ask again later");
                    break;
                case 7:
                    System.out.println("Most likely");
                    break;
                case 8:
                    System.out.println("My answer is yes");
                    break;
                case 9:
                    System.out.println("Cannot predict now");
                    break;
                case 10:
                    System.out.println("Don't count on it");
                    break;
                case 11:
                    System.out.println("Yes definitely");
                    break;
                case 12:
                    System.out.println("You may rely on it");
                    break;
                case 13:
                    System.out.println("Reply hazy try again");
                    break;
                case 14:
                    System.out.println("Concentrate and ask again");
                    break;
                case 15:
                    System.out.println("Very doubtful");
                    break;
                case 16:
                    System.out.println("Better not to tell you know");
                    break;
                default:
                    System.out.println("Outlook good");
            }
        }
    }

}
