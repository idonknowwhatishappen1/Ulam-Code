public class Ulam {
    public static void main(String[] args) {
        int n = 27; 
        System.out.println("Ulam sequence for n = " + n + ":");
        printUlamSequence(n);
    }

    public static void printUlamSequence(int n) {
        System.out.print(n + " ");
        while (n != 1) {
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = 3 * n + 1;
            }
            System.out.print(n + " ");
        }
    }
}
