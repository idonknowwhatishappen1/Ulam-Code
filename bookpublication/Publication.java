package bookpublication;

import java.io.Serializable;

public class Publication implements Display,Serializable {
    private String title;
    private String language;
    private double price;

    public Publication(String title, String language, double price) {
        this.title = title;
        this.language = language;
        this.price = price;
    }

    public Publication() {
		// TODO Auto-generated constructor stub
	}

	public void display() {
        System.out.println("Publication: " + title + ", Language: " + language + ", Price: $" + price);
    }

    public void print() {
        display();
    }
}

