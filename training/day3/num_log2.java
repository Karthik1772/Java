//ip=1234 op=123
import java.util.Scanner;

public class num_log2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n =scan.nextInt();
        int rem = 0;
        n=n/10;
        rem = rem + n;
        System.out.println(rem);
    }
}
