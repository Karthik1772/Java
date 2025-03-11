//Sum Of A Digits Of Number

import java.util.Scanner;

public class sumdigi {
    static int sum(int n){
        int sum =0,rem;
        for(;n>0;){
            rem= n%10;
            sum=sum+rem;
            n=n/10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();
        System.out.println("the sum of digits of the number "+n+" is "+sum(n));
    }
}
