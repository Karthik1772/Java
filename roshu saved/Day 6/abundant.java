public class abundant {
    public static void main(String[] args) {
        int n = 18;
        int sum = 0;
        int i = 1;
        while(n != i){
            if(n%i==0){
                sum = sum+i;
            }
            i++;
        }
        if(n  < sum){
            System.out.println("abundant number");
        }
        else{
            System.out.println("not abundant number");
        }
    }
}
