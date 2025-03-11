import java.util.Scanner;
//Perfect Number In Java
public class perfectnumber {
    static int perfect(int num) {
        int sum = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum = sum + i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        if (n == perfect(n)) {
            System.out.println("perfect number");
        } else {
            System.out.println("not a perfect no");
        }
    }
}
