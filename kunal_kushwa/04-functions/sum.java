//Write a program to print the sum of two numbers entered by user by defining your own method.

import java.util.Scanner;

public class sum {
    static int add(int a ,int b){
        int add=a+b;

        return add;
    }
   public static void main(String[] args) {
    Scanner scan= new Scanner(System.in);
    int a=scan.nextInt(),b=scan.nextInt();
    System.out.println("the sum of "+a+" and "+b+" is "+add(a,b));
   } 
}
