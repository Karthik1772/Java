//Factorial Program In Java

import java.util.Scanner;

public class fact {
    static int factorial(int n)
    {
        int fact=1;
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number");
        int n =scan.nextInt();
        System.out.println("the facctorial of the number "+n+" is "+factorial(n));
    }
}
