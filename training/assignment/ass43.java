//Write a Program to Find out all Sunny numbers present within a given range.

import java.util.Scanner;

public class ass43 {
    static long ps(long num){
        long i,count=0;
        for(i=0;i*i<=num;i++){
            if(i*i==num){
                count=1;
            }
        }
        return count;
    }
    static void sunny(long range){
        for(int i=0;i<=range;i++){
            if(ps(i+1)==1){
                System.out.print(i+" ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        long n =scan.nextLong();
        sunny(n);
    }
}
