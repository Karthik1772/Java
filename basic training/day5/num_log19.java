
import java.util.Scanner;

//code to convert binary to decimal
public class num_log19 {
    static long bd(long n) {
            long sum = 0, a = 1;
            while (n > 0) {
                sum = sum + ((n % 10) * a);
                a = a * 2;
                n = n / 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long n = scan.nextLong();
        System.out.println(bd(n));
    }
}
