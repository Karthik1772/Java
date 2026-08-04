import java.util.Scanner;

public class Tribonacci{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of terms: ");
        int n = scanner.nextInt();
        
        if (n < 1) {
            System.out.println("Please enter a positive integer.");
            return;
        }
        
        int first = 1, second = 1, third = 2;
        
        System.out.print("Tribonacci Sequence: ");
        
        if (n >= 1) System.out.print(first + " ");
        if (n >= 2) System.out.print(second + " ");
        if (n >= 3) System.out.print(third + " ");
        
        for (int i = 4; i <= n; i++) {
            int next = first + second + third;
            System.out.print(next + " ");
            first = second;
            second = third;
            third = next;
        }
        
        scanner.close();
    }
}
