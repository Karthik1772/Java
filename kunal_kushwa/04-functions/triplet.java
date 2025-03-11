//Write a function to check if a given triplet is a Pythagorean triplet or not. 
//(A Pythagorean triplet is when the sum of the square of two numbers is equal to the square of the third number).

import java.util.Scanner;

public class triplet {
    static void pytho(int a, int b, int c) {
        a = a * a;
        b = b * b;
        c = c * c;
        if (a + b == c || b + c == a || c + a == b) {
            System.out.println("it is a triplets ");
        } else
            System.out.println("not a triplet");
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the 3 numbers");
        int a = scan.nextInt(), b = scan.nextInt(), c = scan.nextInt();
        pytho(a, b, c);
    }
}
