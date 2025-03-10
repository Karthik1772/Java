import java.util.Scanner;

public class arm {
    static int armstrong(int n) {
        int sum = 0, rem,count=count(n);
        while(n>0){
            rem = n % 10;
            sum = sum + (int) Math.pow(rem, count);
            n = n / 10;
        }
        return sum;
    }

    static int count(int n) {
        int count = 0;
        while (n>0) {
            count++;
            n = n / 10;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the number");
        int n = scan.nextInt();
        if (n == armstrong(n)) {
            System.out.println("armstrong no");
        } else
            System.out.println("not an aramstrong no");
    }
}
