class Publication {
    private String title;
    private String language;
    private double price;

    public Publication(String title, String language, double price) {
        this.title = title;
        this.language = language;
        this.price = price;
    }

    public void print() {
        System.out.println("Title: " + title);
        System.out.println("Language: " + language);
        System.out.println("Price: " + price);
    }
}

class Book extends Publication {
    private String author;
    private String ISBN;

    public Book(String title, String language, double price, String author, String ISBN) {
        super(title, language, price); 
        this.author = author;
        this.ISBN = ISBN;
    }

    public void print() {
        super.print();
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + ISBN);
    }
}

public class Excercise2 {
    public static void main(String[] args) {
        Publication[] array = new Publication[2];

        array[0] = new Publication("Title", "English", 19.99);
        array[1] = new Book("Harry Potter", "English", 69.99, "J. K. Rowling", "6655577774");

        for (Publication publication : array) {
            publication.print();
            System.out.println(); 
        }
    }
}

