public class FactorialCalculator {
	public static int calculateFactorial(int n) {
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public static void main(String[] args) {
        int number = 5; 
        int factorial = calculateFactorial(number);
        System.out.println(factorial);
    }}

