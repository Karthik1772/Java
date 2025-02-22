//Write a Program to check whether the number is Sunny Number or Not.

import java.util.Scanner;

public class ass25 {
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
        if(ps(n+1)==1){
            System.out.println("Sunny Number");
        }
        else{
            System.out.println("not Sunny Number");
        }
    }
}
