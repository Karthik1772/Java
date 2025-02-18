//ip=1234 & 77 op=7734
import java.util.Scanner;

public class num_log8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number n");
        int n = scan.nextInt();
        System.out.println("Enter the number m");
        int m = scan.nextInt();
       int res = n%100;
       int ans = m*100;
       int total = ans + res;
        System.out.println(total);
    }
}
