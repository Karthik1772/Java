
public class EvenDigits {
    public static void main(String[] args) {
        int a = 24567;
        reverse(a);
    }
    static void reverse(int n){
        int rem = 0;
        while(n!=0){
            int a = n%10;
            rem = rem*10 + a;
            n = n/10;
        }
        printEven(rem);
    }
    static void printEven(int rem){
        boolean first = true;
        while(rem>0){
            int b = rem%10;
            if(b%2==0){
                if(!first){
                    System.out.print(",");
                }
                first = false;
                System.out.print(b);
                
            }
            rem = rem/10;
        }
    }
}