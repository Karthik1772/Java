
import java.util.Scanner;

//find the min no in a given no
                                        
public class num_log12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the number");
        int num = scan.nextInt();
        int rem = 0, min = 9;
        while (num != 0) {
            rem = num % 10;
            if (rem < min) {
                min = rem;
            }
            num = num / 10;
        }
        System.out.println(min);
    }
}
