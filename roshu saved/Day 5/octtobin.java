class Main{

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
    static long db(long n){
    long a=1;
    long sum=0;
    while(n>0){
    sum+=n%2*a;
    a=a*10;
    n=n/2;
    }
    return sum;
    }
    static long bo(long n){
    long sum=0,a=1;
    while (n>0){
    sum=bd(n%1000)*a+sum;
    n=n/1000;
    a=a*10;
    }
    return sum;
    }
    static long ob(long n){
    long a=1,sum=0;
    while(n>0){
    if(n%10>7){
    System.out.print("invalid ;you got "+" ");
    return n%10;
    }
    sum=db(n%10)*a+sum;
    n=n/10;
    a*=1000;
    }
    return sum;
    }
    public static void main(String [] p){
    long n=773429;
    
    
    System.out.println(ob(n));
    return;
    }
    }