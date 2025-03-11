//Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user.

import java.util.Scanner;

public class maxmin {
    static int max(int a, int b, int c) {
        if (a > b && a > c) {
            return a;
        }
        else if (b > a && b > c)
            return b;
        else
            return c;
    }
    static int min(int a, int b, int c) {
        if (a < b && a < c) {
            return a;
        }
        else if (b < a && b < c)
            return b;
        else
            return c;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt(), b = scan.nextInt(), c = scan.nextInt();
        System.out.println("The maximum number is " + max(a, b, c)+"\nThe mainimum number is " + min(a, b, c));
    }
}
