public class home {
    static void pattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == n / 2 || i + j == n / 2 || i - j == -n / 2 || j == 0 && i >= n / 2 || j == n - 1 && i >= n / 2
                        || i == n - 1 && (j <= n / 4 || j > n / 2) || j == n / 2 && i >= 3 * n / 4
                        || i == 3 * n / 4 && j <= n / 2 && j >= n / 4 || j == n / 4 && i >= 3 * n / 4 ||
                         j== 10*n/16 && i<3*n/4 && i>9*n/16 || j==3*n/4 )
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();

        }
        return;

    }

    public static void main(String[] args) {

        pattern(40);
    }
}