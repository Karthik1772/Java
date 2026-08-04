public class palindrome {
    public static void main(String[] args) {
        int a = 181;
        int c = 0;
        int d = a;
        while(a!=0){
            int b = a%10;
            c = c*10 + b;
            a = a/10;
        }
        if(d==c){
            System.out.println("the given number is palindrome");
        }
        else{
            System.out.println("the given number is not palindrome");
        }
    }
}
