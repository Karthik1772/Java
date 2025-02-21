import java.util.Scanner;

//Write a program to compute 1/n!.
public class ass1 {
    public static void main(String[] args) {
        int n;
        float res, fact = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter the n value: ");
        n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        System.out.printf("%f\n", fact);
        res = 1 / fact;
        System.out.printf("%f", res);
        scanner.close();
    }
}
