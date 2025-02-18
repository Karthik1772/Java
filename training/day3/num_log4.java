//ip=1234 & 77 op=1277
import java.util.Scanner;

public class num_log4 {
     public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number n");
        int n = scan.nextInt();
        System.out.println("Enter the number m");
        int m = scan.nextInt();
        int res = (n/100)*100;
        int ans = res + m;
        System.out.println(ans);
    }
}
