// ********** 
// *        *
// *        *
// *  *  *  *
// *   **   *
// *   **   *
// *  *  *  *
// *        *
// *        *
// ********** 
import java.util.Scanner;

public class pattern1 {
    static void pattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0 || j == n - 1 || i == n - 1 || i - j == 0 && i > n / 4 && i < 3 * n / 4
                        || i + j == n - 1 && i > n / 4 && i < 3 * n / 4)
                    System.out.print("*");
                else
                    System.out.print(" ");
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
