
import java.util.Scanner;

//prgm to find maximum of 2 no
public class max {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the 2 no");
        int a = scan.nextInt();
        int b = scan.nextInt();
        System.out.println(a>b?a+" is greater":b+" is greater");
    }
}
