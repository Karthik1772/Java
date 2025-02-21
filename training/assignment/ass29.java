//Write a Program to check whether the number is an Evil Number or Not.

import java.util.Scanner;

public class ass29 {
    static int db(int n) {
        int bin = 0, a = 1;
        while (n > 0) {
            bin = bin + n % 2 * a;
            n = n / 2;
            a = a * 10;
        }
        return bin;
    }

    static int evil(int num) {
        int bin = db(num), count = 0;
        while (bin > 0) {
            if (bin % 10 == 1) {
                count = count + 1;
            }
            bin = bin / 10;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        if (evil(n) % 2 == 0) {
            System.out.println("evil no");
        } else {
            System.out.println("not a evil no");
        }
    }
}
