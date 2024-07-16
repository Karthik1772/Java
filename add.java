import java.util.Scanner;

public class add {
    public static void main(String[] args) {
        int a ,b ,sum;
        
        Scanner s = new Scanner(System.in);
        System.out.print("enter the value of a ");
        a = s.nextInt();
        System.out.print("enter the value of b ");
        b = s.nextInt();
        sum=a+b;
        System.out.println("sum is "+sum);
    }
}
