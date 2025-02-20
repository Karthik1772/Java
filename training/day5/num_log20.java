
import java.util.Scanner;

//code to convert binary to decimal
public class num_log20 {
    static int convert(int n) {
        int sum = 0, a = 1;
        while (n > 0) {
            sum = sum + ((n % 10) * a);
            a = a * 2;
            n = n / 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println(convert(n));
    }
}
