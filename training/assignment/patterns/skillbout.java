import java.util.Scanner;

public class skillbout {

    static void pattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 15 * n; j++) {
                if ((i == 0 && j < 5 || ((j == 0) && (i <= n / 2)) && (j < 5) || i == n / 2 && j < 5
                        || ((j == n - 1) && (i >= n / 2)) || i == n - 1 && j < 5)
                        || (j == 6 || (i + j == n + 6 - 2) && (i <= n / 2)
                                || ((i - j) + 6 == n / 2 - 1) && (i >= n / 2))
                        || (i == 0 && j <= 15 && j >= 11 || i == n - 1 && j <= 15 && j >= 11 || j == n / 2 + 11)
                        || (j == 17 || i == n - 1 && j >= 17 && j <= 20)
                        || (j == 22 || i == n - 1 && j >= 22 && j <= 25)
                        || (i == n / 2 && j >= 30 && j <= 33 || j == 30 || i == n - 1 && j >= 30 && j <= 33
                                || i == 0 && j >= 30 && j <= 33 || j == n - 1 + 30)
                        || (j == 36 || i == 0 && j >= 36 && j <= 38 || i == n - 1 && j >= 36 && j <= 38
                                || j == n - 1 + 35)
                        || (j == 41 || i == n - 1 && j >= 41 && j <= 43 || j == n - 1 + 40)
                        || i == 0 && j >= 46 && j <= 50 || j == n / 2 + 46)
                    System.out.print("*");
                else
                    System.out.print(" ");
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