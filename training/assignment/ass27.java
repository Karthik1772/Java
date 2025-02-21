//Write a Program to check whether the number is a Pronic Number or Not.

import java.util.Scanner;

public class ass27 {
    static int pronic(int num) {
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (i * (i + 1) == num) {
                count = 1;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        if (pronic(n) == 1) {
            System.out.println("Pronic Number");
        } else {
            System.out.println("not Pronic Number");
        }
    }
}
