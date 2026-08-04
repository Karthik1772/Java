public class factorial {

    public static void main(String[] args) {
        int n = 10;
        System.out.println("Factorial is " + factorial(n));
    }

    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}