
import java.util.Scanner;

public class calci {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the two numbers ");
        float a = scan.nextFloat();
        float b = scan.nextFloat();
        System.out.println("Enter the operator");
        char opr = scan.next().charAt(0);
        switch (opr) {
            case '+':
                System.out.println("Addition of two numbers is " + (a + b));
                break;
            case '-':
                System.out.println("Subtraction of two numbers is " + (a - b));
                break;
            case '*':
                System.out.println("Multiplication of two numbers is " + (a * b));
                break;
            case '/':
                System.out.println("Division of two numbers is " + (a / b));
                break;
            case '%':
                System.out.println("Modulus of two numbers is " + (a % b));
                break;
            default:
                System.out.println("Invalid Operation");

        }

    }
}
