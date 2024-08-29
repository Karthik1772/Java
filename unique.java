import java.util.Scanner;

public class unique {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number");
        int num1 = scan.nextInt();
        int num2,product = 1,sum = 0,result;
        num2 = num1;
        while(num2>0){
            int rem = num2 % 10;
            num2 /= 10;
            product = product * rem;
            sum = sum + rem;
        }
        result = product - sum;
        System.out.println("result is " + result);
    }
}
