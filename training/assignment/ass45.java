//Write a Program to Find out all Pronic numbers present within a given range.

import java.util.Scanner;

public class ass45 {
    static int check_pronic(int num) {
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (i * (i + 1) == num) {
                count = 1;
            }
        }
        return count;
    }
static void pronic(int range){
    for(int i=1;i<range;i++){
        if (check_pronic(i) == 1) {
            System.out.print(i+" ");
        }
    }
}
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println("not Pronic Number");
        pronic(n);
    }
}
