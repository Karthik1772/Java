
// *****
// *****
// *****
// *****
// *****
import java.util.Scanner;

public class pattern1 {
    static void pattern(int n) {
        for (int i = 0; i < n; i++) {//row
            for (int j = 0; j < n; j++) {//col
                System.out.print("*");
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
