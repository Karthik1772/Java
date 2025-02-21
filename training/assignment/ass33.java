//Write a program to find out all Armstrong numbers present within a given range.

import java.util.Scanner;

public class ass33 {
    static int count(int num) { 
        int count = 0;
        while (num > 0) {
            count++;
            num = num / 10;
        }
        return count;
    }

    static int check_armstrong(int num) {
        int len = count(num);
        int rem , sum = 0;
        while (num > 0) {
            rem = num % 10;
            int c = (int) Math.pow(rem, len);
            sum = sum + c;
            num = num / 10;
        }
        return sum;
    }

    static void armstrong(int range) {
        for (int i = 0; i <= range; i++) {
            if (i == check_armstrong(i)) {
                System.out.print(i+" ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        armstrong(n);
    }
}
