import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Book scifi = new Book();
        Book french = new Book();
        french.setTitle("Candide");
        french.setAuthor("Voltaire");

        scifi.setAuthor("Sanderson, Brandon");
        scifi.setTitle("The Way of Kings");
        scifi.setPages(1023);

        Book history = new Book("Rise and Fall of the Roman Empire", "", 800);
        System.out.println(history.getTitle() + " by " + history.getProperName());

        int n = 5;
        Book[] library = new Book[n];
        library[0] = scifi;
        library[1] = french;
        library[2] = history;
        library[3] = new Book("Programming in Java", "Liang", 1595);
        library[4] = new Book("The Color of War", "Sanderson, Brandon", 475);


       // printBooks(library, n);



    System.out.println(scifi.getTitle() + " by " + scifi.getAuthor());
    System.out.println(scifi.getTitle() + " by " + scifi.getProperName());
    System.out.println(french.getTitle() + " by " + french.getAuthor());
    System.out.println(french.getTitle() + " by " + french.getProperName());





    System.out.println(scifi);
    System.out.println(french);
    System.out.println(history);

    // System.out.println(scifi.getBiblio());
    Book b = readBookFromKeyboard();
    System.out.print(b);


    }

    private static void printBooks(Book[] library, int n) {
        System.out.println("------------------");
        int pageTotal = 0;
        for(int i = 0; i < n; i++) {
            pageTotal += library[i].getPages();
            System.out.println(library[i]);
        }
    System.out.printf("Average size: %1.0f pages", (double)pageTotal/n);
    }

    public static Book readBookFromKeyboard() {
        Book result = null;
        String title;
        String author;
        int pages;
        Scanner input = new Scanner(System.in);
        System.out.println("Author? ");
        author = input.nextLine();
        System.out.println("Title? ");
        title = input.nextLine();
        System.out.println("Pages? ");
        pages = input.nextInt();

        result = new Book(title, author, pages);
        return result;
    }


}

