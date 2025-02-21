
import java.util.Scanner;

//Write a Program to check whether the number is Magic Number or Not.
public class ass20 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int n=scan.nextInt();
        if(n%9==1)
        {
            System.out.println("magic no");
        }
        else{
            System.out.println("not a magic no");
        }
    }
}
