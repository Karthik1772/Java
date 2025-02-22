
import java.util.Scanner;

//Write a program to find out all perfect square numbers present within a given range.
public class ass32 {
    static long check_ps(long num) {
        long i, count = 0;
        for (i = 0; i * i <= num; i++) {
            if (i * i == num) {
                count = 1;
            }
        }
        return count;
    }

    static void ps(int range) {
        for (int i = 1; i <= range; i++) {
            if (check_ps(i) == 1) {
                System.out.print(i + " ");
            }

        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        ps(n);
    }
}
