public class odd {
    public static void main(String[] args) {
        int a = 245679;
        while(a>0){
            int b = a%10;
            if(b%2!=0){
                System.out.print(b+",");
            }
            a = a/10;
           
        }
    }
}
