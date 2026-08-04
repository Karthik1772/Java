
public class DigitProduct {
    public static void main(String[] args) {
        int sum =1;
        int num = 395683;
        
        while(num>0){
            int rem = num%10;
            if(rem==0){
                rem = 1;
            }
             sum = sum * rem;
            num = num/10;
        }
        System.out.println(sum);

    }
}