//Calculate Average Of N Numbers

import java.util.Scanner;

public class avg {
    static int Average(int n){
        int sum=0,count=0;
        for(int i=1;i<=n;i++){
            sum=sum+i;
            count++;
        }
        return sum/count;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the number");
        int n = scan.nextInt();
        System.out.println("the sum of the number "+n+" is "+Average(n));
    }
}
