//Power In Java

import java.util.Scanner;

public class pow {
    static int power(int b,int p){
        int power=(int)Math.pow(b, p);
        return power;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the base number and the power");
        int b = scan.nextInt();
        int p =scan.nextInt();
        System.out.println("the power is "+power(b,p));
    }
}
