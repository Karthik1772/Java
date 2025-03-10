import java.util.Scanner;

public class palindrome {
    static int pali(int n) {
        int palindrome = 0,rem;
        while(n>0){
            rem=n%10;
            palindrome=palindrome*10+rem;
            n=n/10;
        }
        return palindrome;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        if (n == pali(n)) {
            System.out.println("it is a palindrome");
        } else {
            System.out.println("not a palindorme");
        }
    }

}
