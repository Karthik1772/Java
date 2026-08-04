public class bintohexa {
    static long bd(long n){
        long a=1;
        long sum=0;
        while(n>0){
        sum+=n%10*a;
        a=a*2;
        n=n/10;
        }
        return sum;
    }
    static String bh(long n){
        String s="";
        while(n>0){
        int t=(int)bd(n%10000);
        if(t>9){
        s=(char)(97+t%10)+s;
        }
        else{
        s=(char)(48+t)+s;
        }
        n=n/10000;
        }
        
        return s;
        } 
        public static void main(String [] p){
        long n=10110111110101l;
        
        bh(n);
        System.out.println( bh(n));
        return;
        }
                
}
