
import java.util.Scanner;

//print even no in a given no


public class num_log13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the number");
        int num = scan.nextInt();
        int rem=0;
        while(num!=0){
            rem=num%10;
            if(rem%2==0){
                System.out.println(rem+" ");
            }
            num=num/10;
        }
    }
}
