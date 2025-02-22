//Write a Program to Find out all Evil numbers present within a given range.

import java.util.Scanner;

public class ass47 {
    static int db(int n) {
        int bin = 0, a = 1;
        while (n > 0) {
            bin = bin + n % 2 * a;
            n = n / 2;
            a = a * 10;
        }
        return bin;
    }

    static int check_evil(int num) {
        int bin = db(num), count = 0;
        while (bin > 0) {
            if (bin % 10 == 1) {
                count = count + 1;
            }
            bin = bin / 10;
        }
        return count;
    }
    static void evil(int range){
        for(int i=1;i<range;i++){
            if (check_evil(i) % 2 == 0) {
                System.out.print(i+" ");
            } 
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        evil(n);
    }
}
