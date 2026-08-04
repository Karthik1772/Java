public class perfectno {
    public static void main(String[] args) {
        int n = 6;
        int sum = 0;
        int i = 1;
        while(n != i){
            if(n%i==0){
                sum = sum+i;
            }
            i++;
        }
        if(n == sum){
            System.out.println("perfect number");
        }
        else{
            System.out.println("not perfect number");
        }
    }
}
