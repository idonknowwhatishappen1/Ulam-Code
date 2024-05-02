package bookpublication;

public class Main {
    public static void main(String[] args){
        Display[] array = new Display[3];

        array[0] = new Publication("IELTS", "English", 19.99);
        array[1] = new Book("Harry Potter", "English", 69.99, "J. K. Rowling", "6655577774");
        array[2] = new Car("Conan", 619, 3000);

        for (Display publication : array) {
            publication.print();
            System.out.println();
        }
    }
}

