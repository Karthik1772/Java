//Write a program to find out all Perfect numbers present within a given range.

import java.util.Scanner;

public class ass35 {
    static int check_perfect(int num) {
        int sum = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum = sum + i;
            }
        }
        return sum;
    }

    static void perfect(int range) {
        for (int i = 0; i < range; i++) {
            if (i == check_perfect(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        perfect(n);
    }
}
