//Sum Of N Numbers
import java.util.Scanner;

public class sum {
    static int add(int n){
        int sum=0;
        for(int i=0;i<=n;i++){
            sum=sum+i;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();
        System.out.println("the sum is "+add(n));
    }
}
