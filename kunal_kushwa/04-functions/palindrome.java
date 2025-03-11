//Write a function to find if a number is a palindrome or not. Take number as parameter.

import java.util.Scanner;

public class palindrome {
    static int palin(int n) {
        int rev = 0,rem;
        while(n>0){
            rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }
        return rev;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        if (n == palin(n)) {
            System.out.println("it is a palindrome");
        } else
            System.out.println("not a palindrome");
    }
}
