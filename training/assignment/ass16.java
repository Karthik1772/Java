
import java.util.Scanner;

//Write a program to check whether a given number is a perfect number or not.
public class ass16 {
    static int perfect(int num) {
        int sum = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum = sum + i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        if (n == perfect(n)) {
            System.out.println("perfect number");
        } else {
            System.out.println("not a perfect no");
        }
    }
}
