
import java.util.Scanner;

//find nth fibonacci no using recursion
public class prgm4 {
    static int fibonacci(int n){
        if(n==0||n==1){
            return n;
        }else{
            return fibonacci(n-1)+fibonacci(n-2);
        }
    }
   public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int n= scan.nextInt();
    System.out.println(fibonacci(n));
   } 
}
