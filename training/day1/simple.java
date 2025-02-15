import java.util.Scanner;

public class simple {
    public static void main(String[] args) {
        float p,t,r;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Principle,Time,Rate");
        p=scan.nextFloat();
        t=scan.nextFloat();
        r=scan.nextFloat();
        System.out.println("Simple Intrest = "+(p*t*r)/100);
    }
}
