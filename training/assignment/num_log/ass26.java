import java.util.Scanner;

//Write a Program to check whether the number is Disarium Number or Not.
public class ass26 {
    static int sum(int num) {
        int sum = 0, rem = 0, count = count(num);
        while (num > 0) {
            rem = num % 10;
            sum = sum + (int) Math.pow(rem, count);
            count --;
            num = num / 10;
        }
        return sum;
    }

    static int count(int num) {
        int count = 0;
        while (num > 0) {
            count++;
            num = num / 10;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        if(n==sum(n)){
            System.out.println("Disarium Number");
        }
        else{
            System.out.println("not a Disarium Number");
        }
    }
}
