
//Write a program to check whether a given number is a strong number or not.
import java.util.Scanner;

public class ass15 {
    static int fact(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }
        return fact;
    }

    static int strong(int num) {
        int rem = 0, sum = 0;
        while (num > 0) {
            rem = num % 10;
            sum = sum + fact(rem);
            num = num / 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        if (n == strong(n)) {
            System.out.println("strong no");
        } else {
            System.out.println("not an strong no");
        }
    }
}
