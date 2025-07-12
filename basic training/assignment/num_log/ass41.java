//Write a Program to Find out all Spy numbers present within a given range.

import java.util.Scanner;

public class ass41 {
    static int sum(int num) {
        int sum = 0, rem = 0, prod = 1,temp=num;
        while (num > 0) {
            rem = num % 10;
            num = num / 10;
            sum = sum + rem;
            prod = prod * rem;
        }
        if (sum == prod) {
            return temp;
        } 
        return 0;
    }

    static void spy(int range) {
        for (int i = 1; i <= range; i++) {
            if(sum(i)>0){
                System.out.print(i+" ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        spy(n);
    }
}
