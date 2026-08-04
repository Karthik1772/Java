public class automorphic {
    static int auto(int n){
        int sum = 0;
        while(n>0){
            int a = n%10;
            sum ++;
            n = n/10;
        }
        return sum;
    }

    public static void main(String[] args) {
        int n = 25;
        int ans = n;
        int sum = auto(n);
        int a = (int)Math.pow(10, sum);
        if(ans == (n*n)%a){
            System.out.println("Automorphic number");
        }
        else{
            System.out.println("Not an automorphic number");
        }
        
    }
}
