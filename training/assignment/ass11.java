
import java.util.Scanner;

//Write a program to check the given number is a palindrome or not.
public class ass11 {
    static long palindrome(long n) {
        long rem = 0, rev = 0;
        while (n > 0) {
            rem = n % 10;
            rev = rev * 10 + rem;
            n = n / 10;
        }
        return rev;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long n = scan.nextLong();
        if (n == palindrome(n)) {
            System.out.println("it is palindrome");
        } else {
            System.out.println("not a palindrome");
        }
    }
}
