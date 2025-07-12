//encode set of all odd digit and even digit

import java.util.Scanner;

public class num_log17 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("enter the number");
        int a = scan.nextInt();
        while (a != 0) {
            int b = a % 10;
            if (b % 2 != 0) {
                System.out.print(b);
            }
            a = a / 10;
        }
    }
}
