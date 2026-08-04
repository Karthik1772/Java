public class harshad {
    static int harsh(int n){
        int sum = 0;
        while(n>0){
            int a = n%10;
            sum = sum+a;
            n = n/10;
        }
        return sum;
    }
    public static void main(String[] args) {
        int n = 1729;
        harsh(n);
        int sum = harsh(n);
        if(n%sum == 0){
            System.out.println("harshad number");
        }
        else{
            System.out.println("not a harshad number");
        }
    }
}
