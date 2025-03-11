
import java.util.Scanner;

//Define a program to find out whether a given number is even or odd.
public class evenodd {
    static void even(int n) {
        if (n % 2 == 0) {
            System.out.println(n + " is a even number");
        } else
            System.out.println(n + " is a odd number");
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        even(n);

    }
}
