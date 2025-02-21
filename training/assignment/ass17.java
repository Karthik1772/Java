
//Write a program to check whether a given number is a Harshad number or not.
import java.util.Scanner;

public class ass17 {
    static int sum(int num){
        int sum=0;
        while(num>0){
            sum=sum+(num%10);
            num=num/10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        if((n%sum(n))==0){
            System.out.println("harshad number");
        }
        else{System.out.println("not a harshad number");}
    }
}
