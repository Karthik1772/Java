public class octatobinary {
    static int db(int n){
        int a = 1;
        int sum = 0;
        while(n>0){
            sum += n%2*a;
            a = a*10;
            n = n/2;
        }
        return sum;
    }
    static long ob(long n){
        long sum = 0;
        long b = 1;
        while(n>0){
            sum = db(n%10)*b + sum ;
            n = n/1000;
            b = b*1000;
        }
        return sum;
    }
    public static void main(String[] args) {
        long n = 476;
        System.out.println(ob(n));
        
    }
}
