//Write a Program to Find out all the Disarium numbers present within a given range.

import java.util.Scanner;

public class ass44 {
    static int sum(int num) {
        int sum = 0, rem = 0, count = count(num);
        while (num > 0) {
            rem = num % 10;
            sum = sum + (int) Math.pow(rem, count);
            count --;
            num = num / 10;
        }
        return sum;
    }

    static int count(int num) {
        int count = 0;
        while (num > 0) {
            count++;
            num = num / 10;
        }
        return count;
    }
    static void disarium (int range){
        for(int i=1;i<=range;i++){
            if(i==sum(i)){
                System.out.print(i+" ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        disarium(n);
    }
}
