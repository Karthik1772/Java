import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("enter the number : ");
        int num = scan.nextInt();
        if(num == 0){
            System.out.print("the number " + num + " is neither even nor odd");
        }
        else if (num % 2 == 0) {
            System.out.println("the number " + num + " is even");
        } else {
            System.out.println("the number " + num + " is odd");
        }
    }
}

