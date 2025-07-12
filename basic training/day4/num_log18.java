//encode set of all even digit

import java.util.Scanner;

public class num_log18 {
    public static int reverse(int a) {
        int rev = 0, rem = 0;
        while (a > 0) {
            rem = a % 10;
            a = a / 10;
            rev = rev * 10 + rem;
        }
        return rev;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the number");
        int a = scan.nextInt();
        a = reverse(a);
        boolean first = true;
        while (a > 0) {
            int b = a % 10;
            if (b % 2 == 0) {
                if (!first) {
                    System.out.print(",");
                }
                System.out.print(b);
                first = false;
            }
            a = a / 10;
        }
    }
}
