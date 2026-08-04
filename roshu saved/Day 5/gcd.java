public class gcd {
    static int gcd1(int a ,int b){
        if (a==0){
            return b;
        }
        if(b==0){
            return a;
        }
        if(a==b){
            return a;
        }
        if(a>b){
            return gcd1(a-b,b);
        }
        else{
            return gcd1(a,b-a);
        }
    }
    public static void main(String[] args) {
        int a=18;
        int b=32;
        System.out.println(gcd1(a,b));
    }
}
