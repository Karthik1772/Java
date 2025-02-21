//Write a program to find out all Strong numbers present within a given range.

import java.util.Scanner;

public class ass34 {
    static int fact(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }
        return fact;
    }

    static int check_strong(int num) {
        int rem = 0, sum = 0;
        while (num > 0) {
            rem = num % 10;
            sum = sum + fact(rem);
            num = num / 10;
        }
        return sum;
    }

    static void strong(int range) {
        for (int i = 1; i <= range; i++) {
            if (i == check_strong(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        strong(n);
    }
}
