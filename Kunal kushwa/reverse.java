
import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num1 = scan.nextInt(),ans = 0,num2;
        num2=num1;
        while(num2>0){
            int rem = num2 % 10;
            num2 /= 10;
            ans = ans*10 + rem;
        }
        System.out.println("the number " + num1 + " after reversing is " + ans);
    }
}
