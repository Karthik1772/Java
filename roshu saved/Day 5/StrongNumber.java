
public class StrongNumber {

    static int factorial(int n){
        int res = 1;
        for(int i=2;i<=n;i++){
            res = res*i;
        }
        return res;
    }
    public static void main(String[] args) {
        int n = 40585;
        int temp = n;
        int sum = 0;
        while(n>0){
            int a = n%10;
            int res = factorial(a);
            sum = sum+res;
            n/=10;
        }
        if(sum == temp){
            System.out.println("yes");
        } else {
            System.out.println("no");
        }

    }
}