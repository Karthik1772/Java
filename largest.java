import java.util.Scanner;

public class largest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); 
        System.out.println("Enter the 2 numbers");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        if(num1 > num2){
            System.out.println(num1 + " is larger than " + num2);
        }else{
            System.out.println(num2 + " is larger than " + num1);
        }
    }
}
