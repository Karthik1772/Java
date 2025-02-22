//Write a program to find out all Abundant numbers present within a given range.

import java.util.Scanner;

public class ass37 {
    static int sum(int num) {
        int sum = 0;
        for (int i = 1; i  < num; i++) {
            if (num%i==0) {
                sum = sum + i;
            }
        }
        return sum;
    }
    static void abundant(int range){
        for(int i=0;i<range;i++){
            if (sum(i) > i) {
                System.out.print(i+" ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println(sum(n));
        abundant(n);

    }
}
