//Calculate Distance Between Two Points
import java.util.Scanner;

public class distance {
    static void dist(int a,int b){
        if(a>b){
            System.out.println("the distance btw the 2 points is "+(a-b));
        }
        if(b>a){
            System.out.println("the distance btw the 2 points is "+(b-a));
        }
        if(a==b){
            System.out.println("the distance btw 2 points is 0");
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the two distances");
        int a=scan.nextInt();
        int b = scan.nextInt();
        dist(a, b);
    }
}
