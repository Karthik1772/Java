
import java.util.Scanner;

//factorial in DP
public class prgm5 {
    static int factorial(int n){
        int[] dp = new int[n + 1];
        dp[0]=1;
        dp[1]=1;
        for(int i=2;i<=n;i++){
            dp[i]=i*dp[i-1];
        }

        return dp[n];
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        System.out.println(factorial(n));
    }
}
