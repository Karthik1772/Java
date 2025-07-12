
import java.util.*;

public class solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the number of test cases");
        int t = in.nextInt();
        for (int a = 0; a < t; a++) {
            int sum = 0;
            System.out.println("enter the last no");
            int n = in.nextInt();
            for (int i = 1; i < n; i++) {
                if (i % 3 == 0 || i % 5 == 0) {
                    sum = sum + i;
                }
            }
            System.out.println(sum);
        }
    }
}
