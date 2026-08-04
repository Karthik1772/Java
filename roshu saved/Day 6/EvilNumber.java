
public class EvilNumber {
    static int decimalToBinary(int n){
        int sum=0;
        int a =1;
        while(n>0){
            sum = sum + n%2*a;
            a*=10;
            n/=2;
        }
        return sum;
    }
    static void evil(int n){
        int binary = decimalToBinary(n);
        int count=0;
        while (binary>0){
            int a = binary%10;
            if(a == 1){
                count++;
            }
            binary/=10;
        }
        if(count%2==0){
            System.out.println("evil number");
        } else {
            System.out.println("not evil number");
        }
    }
    public static void main(String[] args) {
        int n = 4;
        evil(n);
    }
}