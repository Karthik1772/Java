
import java.util.Scanner;

public class even {

    static void printeven(int n) {
        for (int i = 0; i <= n; i += 2) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        printeven(n);
    }

}
