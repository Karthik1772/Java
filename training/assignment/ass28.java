//Write a Program to check whether the number is a Trimorphic Number or Not.

import java.util.Scanner;

public class ass28 {
    static int count(int num) {
        int count = 0;
        while (num > 0) {
            count++;
            num = num / 10;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int n=scan.nextInt();
        int prod=n*n*n;
        int p=prod%(int)Math.pow(10, count(n));
        if(n==p){
            System.out.println("Trimorphic Number");
        }
        else
        {
            System.out.println("not Trimorphic Number");
        }
    }
}
