
import java.util.Scanner;

public class max {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the 3 no");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        if (a > b && a > c) {
            System.out.println(a + " is greater");
        }
        if (b > a && b > c) {
            System.out.println(b + " is greater");
        }
        if (c > b && c > a) {
            System.out.println(c + " is greater");
        }

    }
}
