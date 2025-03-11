//Write a program to print the circumference and area of a circle of radius entered by user by defining your own method.

import java.util.Scanner;

public class circle {
    static float circum(float r) {
        float c = (float) (2 * 3.14 * r);
        return c;
    }

    static float area(float r) {
        float a = (float) (3.14 * r * r);
        return a;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float r = scan.nextFloat();
        System.out.println("the circumference of the circle is " + circum(r));
        System.out.println("the circumference of the circle is " + area(r));
    }
}
