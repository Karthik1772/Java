public class spy {
    public static void main(String[] args) {
        int n = 123;
        int sum = 0;
        int product = 1;
        while(n>0){
            int a = n%10;
            sum = sum+a;
            product = product*a;
            n = n/10;
        }
        if(sum==product){
            System.out.println("spy number");
        }
        else{
            System.out.println("not a spy number");
        }
    }
}
