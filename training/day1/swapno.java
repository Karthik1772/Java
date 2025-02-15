//swap 2 no using bitwise XOR

import java.util.Scanner;

public class swapno {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the numbers");
        int a = scan.nextInt();
        int b = scan.nextInt();
        System.out.println("No before swap " + a + " " + b);
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("No after swap " + a + " " + b);

    }
}
