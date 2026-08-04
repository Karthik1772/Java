public class maximum {
    public static void main(String[] args) {
        int a = 565394;
        int max = 0;
        while(a>0){
            int b = a%10;
            if(b>max){
                max = b;
            }
            a = a/10;
        }
        
        System.out.println("maximum digit of number is "+max);
    }
}
