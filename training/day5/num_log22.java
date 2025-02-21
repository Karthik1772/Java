
//code for octal to binary
import java.util.Scanner;

public class num_log22 {
    static long db(long n) {
        long bin = 0, a = 1;
        while (n > 0) {
            bin = bin + n % 2 * a;
            n = n / 2;
            a = a * 10;
        }
        return bin;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long num = scan.nextLong(), ans = 0, a = 1;
        while (num > 0) {
            if(num%10>7){
                System.out.println("not an octal number");
                break;
            }
            ans = db(num % 10) * a + ans;
            num = num / 10;
            a = a * 1000;
        }
        System.out.println(ans);
    }
}
