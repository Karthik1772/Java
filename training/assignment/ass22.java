
//Write a Program to check whether the number is Neon Number or Not.
import java.util.Scanner;

public class ass22 {
    static int sum(int num) {
        int sum = 0, rem = 0;
        num = num * num;
        while (num > 0) {
            rem = num % 10;
            num = num / 10;
            sum = sum + rem;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        if (n == sum(n)) {
            System.out.println("it is a neon number ");
        } else {
            System.out.println("not a neon number");
        }
    }
}
