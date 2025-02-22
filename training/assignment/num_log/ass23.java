
import java.util.Scanner;

//Write a Program to check whether the number is Spy Number or Not.
public class ass23 {
    static void sum(int num) {
        int sum = 0, rem = 0, prod = 1;
        while (num > 0) {
            rem = num % 10;
            num = num / 10;
            sum = sum + rem;
            prod = prod * rem;
        }
        if(sum==prod){
            System.out.println("is Spy Number");
        }
        else {System.out.println("not is Spy Number");}
    }

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        sum(n);
    }
}
