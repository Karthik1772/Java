
import java.util.Scanner;

public class InrToUsd {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the indian ruppe ");
        float inr = scan.nextFloat();
        double usd = inr/83.97;
        usd = (float)(usd);
        System.out.println("Indian National Ruppe " + inr + " in US Dollars is " + usd);
    }
}
