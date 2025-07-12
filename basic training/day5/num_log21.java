
import java.util.Scanner;

//code for binary to octal
public class num_log21 {
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
        long n = scan.nextLong(), num = n;
        while (n > 0) {
            
        }
    }
}
