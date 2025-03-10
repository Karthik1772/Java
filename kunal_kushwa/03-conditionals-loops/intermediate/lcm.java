//LCM Of Two Numbers

import java.util.Scanner;

public class lcm {
    static int hcf(int a, int b) {
        int rem = a % b;
        if (rem != 0) {
            return hcf(b, rem);
        } else {
            return b;
        }
    }
    static int lcm(int a,int b)
    {
        return (a*b)/hcf(a, b);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the 2 no ");
        int a = scan.nextInt();
        int b = scan.nextInt();
        System.out.println("LCM of " + a + " and " + b + " is: " + lcm(a, b));

    }
}
