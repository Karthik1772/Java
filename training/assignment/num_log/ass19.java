//Write a program to check whether a given number is an Automorphic number or not.

import java.util.Scanner;

public class ass19 {
    static int count(int num) {
        int count = 0;
        while (num > 0) {
            count++;
            num /= 10;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int sum = (int) Math.pow(10, count(n));
        if (n == ((n * n) % sum)) {
            System.out.println("automorphic number");
        } else {
            System.out.println("not a automorphic number");
        }
    }
}
