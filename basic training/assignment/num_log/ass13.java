//Write a program to check whether a given number is a perfect square number or not.

import java.util.Scanner;

public class ass13 {
    static long ps(long num){
        long i,count=0;
        for(i=0;i*i<=num;i++){
            if(i*i==num){
                count=1;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        long n =scan.nextLong();
        if(ps(n)==1){
            System.out.println("perfect square number");
        }
        else{
            System.out.println("not perfect square number");
        }
    }
}
