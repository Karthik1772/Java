//prgm to find odd or even

import java.util.Scanner;

public class oddeven {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number");
        int a = scan.nextInt();
        System.out.println((a % 2 == 0) ? "even" : "odd");
        System.out.println(((a | 1) > a) ? "even" : "odd");//bitwise or
        System.out.println(a == (a >> 1) << 1 ? "even" : "odd");//left and right shift
    }
}
