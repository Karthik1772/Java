
import java.util.Scanner;

//code to reverse a give no
public class num_log10 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter the number");
        int num = scan.nextInt();
        int rev=0,rem=0;
        while(num!=0){
            rem=num%10;
            num=num/10;
            rev=rev*10+rem;
        }
        System.out.println(rev);
    }
}
