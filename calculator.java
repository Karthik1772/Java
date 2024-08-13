import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the two numbers ");
        float num1 = scan.nextFloat();
        float num2 = scan.nextFloat();
        System.out.println("Enter the operator");
        char opr = scan.next().charAt(0);
        float result ;
        if(opr == '+'){
            result = num1 + num2;
            System.out.println("Sum = " + result);
        }
        else if(opr == '-'){
            result = num1 - num2;
            System.out.println("Sum = " + result);
        }
        else if(opr == '*'){
            result = num1 * num2;
            System.out.println("Sum = " + result);
        }
        else if(opr == '/'){
            result = num1 / num2;
            System.out.println("Sum = " + result);
        }
        else if(opr == '%'){
            result = num1 % num2;
            System.out.println("Sum = " + result);
        }
        else{
            System.out.println("Invalid Operation");
        }
    }
}
