public class Disarium {
    static int len(int n){
        
        int count=0;
        while(n>0){
            int a = n%10;
            count++;
            n = n/10;
        }
        return count;
    }
    static void dis(int n){
        int temp = n;
        int sum = 0;
        int b = len(n);
        while(n>0){
            int a = n % 10;
            sum = sum + ((int)Math.pow(a,b));
            b--;
            n = n/10;
        }
        if(temp == sum){
            System.out.println("Disarium");
        }
        else{
            System.out.println("no");
        }
    }
    public static void main(String[] args) {
        int n = 135;
        dis(n);
    }
}
