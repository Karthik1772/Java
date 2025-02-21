
import java.util.Scanner;

//Write a program to find out all palindrome numbers present within a given range.
public class ass30 {

    static int check_palindrome(int n) {
        int rem = 0, rev = 0;
        while (n > 0) {
            rem = n % 10;
            rev = rev * 10 + rem;
            n = n / 10;
        }
        return rev;
    }

    static void palindrome(int range) {
        for (int i = 0; i <= range; i++) {
            if (i == check_palindrome(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        palindrome(num);
    }
}
