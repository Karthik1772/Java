public class strongnumber {
    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n*factorial(n - 1);
    }
    public static void main(String[] args) {
        int n = 1545;
        int temp = n;
        int sum = 0;
        while(n>0){
            int a=n%10;
            sum = sum + factorial(a);
            n = n/10;
        }
        if(temp == sum){
            System.out.println("Strong number");
        }
        else{
            System.out.println("not a strong number");
        }
    }
}
