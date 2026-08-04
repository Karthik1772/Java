public class decimaltobinary {
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
    public static void main(String[] args) {
        int n = 675;
        System.out.println(db(n));
    }
}
