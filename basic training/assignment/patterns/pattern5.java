import java.util.Scanner;

public class pattern5 {
    static void pattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2 * n; j++) {
                if (i + j == n - 1 || i - j == -n + 1 || i == n - 1 && j <= 2 * n - 2 ||
                        i == n / 2 && j >= 3 * n / 4 && j <= (n - 1) + n / 4 ||
                        i <= 3 * n / 4 && i >= n / 2 && (i - j == -n / 4 || i + j == (n - 1) + 3 * n / 4))
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        pattern(n);
    }
}
