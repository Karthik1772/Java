import java.util.Scanner;

public class greet {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name;
        name = scan.nextLine();
        System.out.println("Hello, " + name + "! Hope you're having a great day!");
    }
}
