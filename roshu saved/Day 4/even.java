public class even {
    public static void main(String[] args) {
        int a = 395683;
        while(a>0){
            int b = a%10;
            if(b%2==0){
                System.out.print(b);
            }
            a = a/10;

        }
    }
}
