//ip=1234 op=4
import java.util.Scanner;

public class num_log1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the number");
        int n = scan.nextInt(); 
        int rem = 0;
        rem = n % 10;
        System.out.println(rem);
    }
}
