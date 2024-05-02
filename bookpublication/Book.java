package bookpublication;

public class Book extends Publication{
    private String author;
    private String ISBN;

    public Book(String title, String language, double price, String author, String isbn) {
        super(title, language, price);
        this.author = author;
        this.ISBN = isbn;
    }

    public void display() {
        super.display();
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + ISBN);
    }

    public void print() {
        display();
    }
}

