//HCF Of Two Numbers Program

import java.util.Scanner;

public class hcf {
    static int hcf(int a, int b) {
        int rem = a % b;
        if (rem != 0) {
            return hcf(b, rem);
        } else {
            return b;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the 2 no ");
        int a = scan.nextInt();
        int b = scan.nextInt();
        System.out.println("HCF of " + a + " and " + b + " is: " + hcf(a, b));

    }
}
