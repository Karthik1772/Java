class binarytodecimal{

    static int bd(int n){
        int a =1;
        int sum = 0;
        while(n>0){
            sum += n%10*a;
            a = a*2;
            n = n/10;
            
        }
        return sum;
    }
    public static void main(String[] args) {
          int n = 1101;
          System.out.println(bd(n));
    }
}