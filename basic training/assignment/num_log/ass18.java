
import java.util.Scanner;

public class ass18 {
    static int sum(int num) {
        int sum = 0;
        for (int i = 1; i  < num; i++) {
            if (num%i==0) {
                sum = sum + i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println(sum(n));
        if (sum(n) > n) {
            System.out.println("Abudant no");
        } else {
            System.out.println("not an abundant no");
        }

    }
}
