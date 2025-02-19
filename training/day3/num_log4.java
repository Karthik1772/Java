
//ip=1234 & 77 op=1277
import java.util.Scanner;

public class num_log4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number n");
        int n = scan.nextInt();
        System.out.println("Enter the number m");
        int m = scan.nextInt();
        int res, ans = 0;
        if (n > 0 && m > 0) {
            res = (n / 100) * 100;
            ans = res + m;
        } else if (n < 0 && m > 0) {
            n = -n;
            res = (n / 100) * 100;
            ans = res + m;
            ans = -ans;
        } else if (n > 0 && m < 0) {
            res = (n / 100) * 100;
            m = -m;
            ans = res + m;
            ans = -ans;
        } else if (n < 0 && m < 0) {
            m = -m;
            n = -n;
            res = (n / 100) * 100;
            ans = res + m;
            ans = -ans;
        }
        System.out.println(ans);
    }
}
