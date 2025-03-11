//Write a program to print the factorial of a number by defining a method named 'Factorial'.

import java.util.Scanner;

public class factorial {
    static int fact(int n){
        int fact=1;
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int n=scan.nextInt();
        System.out.println(fact(n));
    }
}
