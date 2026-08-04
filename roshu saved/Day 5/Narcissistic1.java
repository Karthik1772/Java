
public class Narcissistic1 {
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
        int n =15;
        int ctr = 0;
        int i=0;
        int sum=0;
        while (ctr!=n){
            while(i>0){
                int len = length(i);
                int a = i%10;
                int c = (int) Math.pow(a,len);
                sum = sum+c;
                i/=10;
                }
            if (sum == i){
                System.out.println(sum);
                ctr++;
                i++;
            }

        }

    }
}