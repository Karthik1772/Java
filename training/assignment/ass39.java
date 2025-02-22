//Write a Program to Find out all Magic numbers present within a given range.

import java.util.Scanner;

public class ass39 {
    static void magic(int range){
        for(int i=1;i<=range;i++){
            if(i%9==1)
        {
            System.out.print(i+" ");
        }
        }
    }
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int n=scan.nextInt();
        magic(n);
    }
}
