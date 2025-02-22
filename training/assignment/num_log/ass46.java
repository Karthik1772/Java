//Write a Program to Find out all Trimorphic numbers present within a given range.

import java.util.Scanner;

public class ass46 {
    static int count(int num) {
        int count = 0;
        while (num > 0) {
            count++;
            num = num / 10;
        }
        return count;
    }
    static void trimorphic(int range){
        for(int i=1;i<=range;i++){
            int prod=i*i*i;
        int p=prod%(int)Math.pow(10, count(i));
        if(i==p){
            System.out.print(i+" ");
        }
        }
    }
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int n=scan.nextInt();
        trimorphic(n);
    }
}
