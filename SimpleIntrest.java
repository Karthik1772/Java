import java.util.Scanner;

public class SimpleIntrest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); 
        System.out.print("Enter the P T R values : ");
        float p = scan.nextFloat();
        float t = scan.nextFloat();
        float r = scan.nextFloat();
        float si = (p*t*r)/100;
        System.out.println("Simple Intrest to be payed is "+si);
    }
}
