public class Book {
    private String title;
    private String author;
    public int pages;
    //data members or data fields are "encapsulated" by declaring the private

    //constructor
    //no return type on constructors

    public Book(String title, String author, int pages) {
        setTitle(title);
        setAuthor(author);
        setPages(pages);
    }

    public Book() {
        this("", "", -1);
    }


    //setters
    //setters are almost always a void data tyle

    public void setTitle(String title) {
        if (title.length() > 0) {
            this.title = title; //"this" means that it belongs to the class as a whole
        } else {
            this.title = "No title";
        }
    }

    public void setAuthor(String author) {
        this.author = (author.length() > 0) ? author : "Anonynous";
    }

    public void setPages(int pages) {
        this.pages = (pages > 0) ? pages : 1;
    }


    //getters
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPages() {
        return pages;
    }

    public String getProperName() {
        String[] parts = author.split(",");
        String properName = author;
        if (parts.length == 2) {
            properName = parts[1] + " " + parts[0];
        }
        return properName;
    }

    @Override
    public String toString() {
        /*
        return "Book{" +

                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", pages=" + pages +
                '}';
         */

        String result;
        result = String.format("%s by %s (%d pages)", title, getProperName(), pages);
        return result;
    }

    public String getBiblio() {
        String result = String.format("%d, \"%s\" %d pages", author, title, pages);
        return result;
    }
}
