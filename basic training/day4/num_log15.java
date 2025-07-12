
import java.util.Scanner;

//find the sum of a given no 395683
public class num_log15 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("enter the number");
        int num=scan.nextInt();
        int rem=0,sum=0;
        while(num!=0){
            rem=num%10;
            sum=sum+rem;
            num=num/10;
        }
        System.out.println(sum);
    }
}
