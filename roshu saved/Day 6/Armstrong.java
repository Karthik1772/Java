
public class Armstrong {
    static int length(int i){
        int count = 0;
        int b = 0;
        while(i>0) {
            int len = i % 10;
            b = count++;
            i/=10;
        }
        return count;
    }
    public static void main(String[] args) {
        int n = 153;
        int temp = n;
        int len = length(n);
        int sum = 0;
        while(n>0){
            int a = n%10;
            int c = (int) Math.pow(a,len);
            sum = sum+c;
            n/=10;
        }
        if(temp == sum){
            System.out.println("ArmStrong number ");
        }
        else {
            System.out.println("not  ArmStrong number ");
        }
    }
}