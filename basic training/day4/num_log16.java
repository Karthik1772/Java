
import java.util.Scanner;

//find the product of a given no 395683
public class num_log16 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the number");
        int num = scan.nextInt();
        int rem = 0, mul = 1;
        while (num != 0) {
            rem = num % 10;
            mul = mul * rem;
            num = num / 10;
        }
        System.out.println(mul);
    }
}
