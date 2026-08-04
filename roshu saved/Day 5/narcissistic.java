public class narcissistic {

    static int length(int n){
        int b;
        int count = 0;
        while(n>0){
            int a = n % 10;
            b = count++;
            n = n/10;
        }
        power(count, n);
        return count;
         
    }
    static int power(int count,int n){
        int i;
        int sum = 0;
        while (n>0) {
            i = n % 10;
            int d =  (int)Math.pow(i,count);
            sum = sum+d;
            n = n/10;
            
        }
        System.out.println(sum);
        return sum;
    }


    public static void main(String[] args) {
        int n = 153;
        length(n);
    }
}
