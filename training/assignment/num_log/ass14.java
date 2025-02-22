
import java.util.Scanner;

//Write a program to check whether a given number is an Armstrong number or not.
public class ass14 {
    static int count(int num) {
        int count = 0;
        while (num > 0) {
            int a = num % 10;
            count++;
            num = num / 10;
        }
        return count;
    }

    static int amstrong(int num) {
        int len = count(num);
        int rem = 0, sum = 0;
        while (num > 0) {
            rem = num % 10;
            int c = (int) Math.pow(rem, len);
            sum = sum + c;
            num = num / 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        if (n == amstrong(n)) {
            System.out.println("amstrong no");
        } else {
            System.out.println("not an amstrong no");
        }
    }
}
