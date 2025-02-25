import java.util.Scanner;

public class pattern4 {
    static void pattern(int n) {
        for (int i = 0; i < n; i++) {// row
            for (int j = 0; j < n; j++) {// col
                if (i == n / 2 || i + j == n / 2 || i - j == -n / 2 || j == 0 && i > n / 2
                        || i == n - 1 && (j < n / 4 || j > n / 2) || j == n - 1 && i > n / 2
                        || j == n / 4 && i > 3 * n / 4
                        || i == 3 * n / 4 && j >= n / 4 && j <= n / 2
                        || j == n / 2 && i > 3 * n / 4
                        || j == 10 * n / 16 && i < 3 * n / 4 && i > 9 * n / 16
                        || j == 14 * n / 16 && i < 3 * n / 4 && i > 9 * n / 16
                        || j == 11 * n / 16 && i < 3 * n / 4 && i > 9 * n / 16
                        || i == 9 * n / 16 && j <= 14 * n / 16 && j >= 10 * n / 16
                        || i == 12 * n / 16 && j <= 14 * n / 16 && j >= 10 * n / 16
                        || i == 10 * n / 16 && j <= 14 * n / 16 && j >= 10 * n / 16)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println(" ");

        }

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        pattern(n);
    }
}
