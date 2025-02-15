import java.util.Scanner;

public class rect {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the length and breadth");
        float l = scan.nextFloat();
        float b = scan.nextFloat();
        System.out.println("the perimeter of rectangle = "+2*(l+b));
    }
}
