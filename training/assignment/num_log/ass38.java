//Write a program to find out all Automorphic numbers present within a given range.

import java.util.Scanner;

public class ass38 {
    static int count(int num) {
        int count = 0;
        while (num > 0) {
            count++;
            num /= 10;
        }
        return count;
    }

    static void automorphic(int range) {
        for (int i = 1; i <= range; i++) {
            int sum = (int) Math.pow(10, count(i));
            if (i == ((i * i) % sum)) {
                System.out.print(i+" ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        automorphic(n);
    }
}
