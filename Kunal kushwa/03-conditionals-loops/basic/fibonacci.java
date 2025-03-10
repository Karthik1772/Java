
import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int fib1 = 0,fib2 = 1,n,sum;
        System.out.println("Enter the number of terms : ");
        n = scan.nextInt();
        System.out.println(fib1);
        System.out.println(fib2);
        for(int m = 2;m < n;m++){
            sum = fib1 + fib2;
            System.out.println(sum);
            fib1 = fib2;
            fib2 = sum;
        }
    }
}
