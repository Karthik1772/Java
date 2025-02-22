//Write a Program to Find out all Neon numbers present within a given range.

import java.util.Scanner;

public class ass40 {
    static int sum(int num) {
        int sum = 0, rem = 0;
        num = num * num;
        while (num > 0) {
            rem = num % 10;
            num = num / 10;
            sum = sum + rem;
        }
        return sum;
    }
    static void neon(int range){
        for(int i=1;i<range;i++){
            if (i == sum(i)) {
                System.out.println(i+" ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        neon(n);
    }
}
