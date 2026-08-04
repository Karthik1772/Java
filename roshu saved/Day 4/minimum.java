public class minimum {
    public static void main(String[] args) {
        int a = 395683;
        int min = 9;
        while(a>0){
            int b = a%10;
            if(b<min){
                min = b;
            }
            a = a/10;

        }
        System.out.println("minimum of number is "+min);
    }
}
