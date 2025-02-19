
//ip=1243 op=243
import java.util.Scanner;

public class num_log6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = scan.nextInt();
        int count = 1, m = n;
        while (m != 0) {
            m = m / 10;
            count = count * 10;
        }
        count = count / 10;
        int res = n % count;
        System.out.println(res);
    }
}
