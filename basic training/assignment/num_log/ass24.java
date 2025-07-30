
import java.util.Scanner;
//happy no
public class ass24 {

    static void happy(int num) {
        int s;

        while (num > 9) { 
            s = 0;
            while (num != 0) {
                int digit = num % 10;
                s += digit * digit;
                num /= 10;
            }
            num = s;
        }

        if (num == 1 || num == 7) {
            System.out.println("Happy Number"); 
        }else {
            System.out.println("Not a Happy Number");
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scan.nextInt();
        happy(n);
    }
}
