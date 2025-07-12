//find the factorial of n with recurtion

import java.util.Scanner;

public class prgm3 {

    static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1; 
        } else {
            return n * factorial(n - 1); 
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        System.out.println(factorial(n));
    }
}
