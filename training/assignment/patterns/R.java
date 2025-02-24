import java.util.Scanner;

public class R {
    static void pattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j == 0 || i == 0 && j < n / 2 || j == n / 2 && i < n / 2 || i == n / 2 && j < n / 2
                        || i - j == n / 2)
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
