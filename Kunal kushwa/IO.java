import java.util.Scanner;

public class IO{
    public static void main(String[] args) {
        System.out.println("what is your age");
        Scanner input = new Scanner(System.in);
        System.out.println("your age is "+ input.nextInt());
    }
}