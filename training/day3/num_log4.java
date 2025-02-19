//ip=1234 & 77 op=1277
import java.util.Scanner;

public class num_log4 {
    public static int four(int n, int m) {
        if (m < 0) {
        m = -m;
        }
    
        int nSign = 1;
        if (n < 0) {
        nSign = -1;
        n = -n;
        }
    
        int lengthOfM = 0;
        int tempM = m;
        while (tempM > 0) {
        tempM /= 10;
        lengthOfM++;
        }
    
        if (lengthOfM == 0) lengthOfM = 1;
    
        int divisor = 1;
        for (int i = 0; i < lengthOfM; i++) {
        divisor *= 10;
        }
    
        int result = n / divisor;
        result = result * divisor + m;
    
        return nSign * result;
        }
    
        public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int result = four(n, m);
        System.out.println("Output: " + result);
        }
}
