//Define a method that returns the product of two numbers entered by user.

import java.util.Scanner;

public class prod {
    static int mul(int a ,int b){
        int mul=a*b;

        return mul;
    }
   public static void main(String[] args) {
    Scanner scan= new Scanner(System.in);
    int a=scan.nextInt(),b=scan.nextInt();
    System.out.println("the product of "+a+" and "+b+" is "+mul(a,b));
   } 
}
