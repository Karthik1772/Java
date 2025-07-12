//Write a program to find out all Harshad numbers present within a given range.

import java.util.Scanner;

public class ass36 {
    static int sum(int num){
        int sum=0;
        while(num>0){
            sum=sum+(num%10);
            num=num/10;
        }
        return sum;
    }
    static void harshad(int range) {
        for (int i = 1; i <= range; i++) {
            if ((i % sum(i)) == 0) {
                System.out.print(i + " ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        harshad(n);
    }
}
