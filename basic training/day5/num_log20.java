
import java.util.Scanner;

//code to convert decimal to binary
public class num_log20 {
    static int db(int n) {
        int bin = 0, a = 1;
        while (n > 0) {
            bin = bin + n % 2 * a;
            n = n / 2;
            a = a * 10;
        }
        return bin;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println(db(n));
    }
}
