public class Trimorphic {
    static int tri(int n){
        int sum = 0;
        while(n>0){
            int a = n%10;
            sum ++;
            n = n/10;
        }
        return sum;
    }
    public static void main(String[] args) {
        int n = 24;
        int ans = n;
        int sum = tri(n);
        int a = (int)Math.pow(10, sum);
        if(ans == (n*n*n)%a){
            System.out.println("Trimorphic number");
        }
        else{
            System.out.println("Not an Trimorphic number");
        }
        
    }
}
