public class reverse {
    public static void main(String[] args) {
        int a = 395683;
        int c = 0;
        while(a!=0){
            int b = a%10;
            c = c*10 + b;
            a = a/10;
        }
        System.out.println("Reverse of number is "+c);
    }
}
