import java.util.Scanner;

public class vote {
    public static void main(String[] args) {
        int age;
        Scanner s = new Scanner(System.in);
        System.out.print("enter your age ");
        age = s.nextInt();
        if(age >= 18 && age <100){
            System.out.print("eligible to  vote");
        }
        else
        {
            System.out.println("not eligible to vote come next year");
        }
    }
}
