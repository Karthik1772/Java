//ip=1234 & 77 op=771234
import java.util.Scanner;

public class num_log7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number n");
        int n = scan.nextInt();
        System.out.println("Enter the number m");
        int m = scan.nextInt();
        int res = m*10000;
        int ans = res + n;
        System.out.println(ans);
    }
}
