public class happy {
    public static void main(String[] args) {
        int n = 19;
        int sum = 0;
        while(n>0){
            int a = n%10;
            sum = sum + (a*a);
             
            n = n/10;
        }
        if(sum == 1){
            System.out.println("happy number");
        }
        else{
            System.out.println("not a happy number");
        }
    }
}
