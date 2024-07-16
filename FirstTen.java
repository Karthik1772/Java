import java.util.Scanner;

public class FirstTen {
    public static void main(String[] args) {
        int i,num;
        Scanner s = new Scanner(System.in);
        System.out.print("enter the last number to print");
        num = s.nextInt();
        for(i = 1;i <= num;i++){
            System.out.println(i);
        }
    }
}
