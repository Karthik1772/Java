
import java.util.Scanner;

public class num_log3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number n");
        int n = scan.nextInt();
        System.out.println("Enter the number m");
        int m = scan.nextInt();
        int rem = 1, op, count = m;
        while (m >0) {//81174//8117//811/81/8
            m = m / 10;//8117//811//81//8/0
            rem = rem * 10;//10//100//1000/10000/100000
            
        }
        op = (n * rem) + count;//99456*100000+81174
        System.out.println(op);
    }
}