
import java.util.Scanner;

//Check Leap Year Or Not
public class leap {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int y=scan.nextInt();
        if(y%4==0){
            System.out.println("leap year");
        }
        else{
            System.out.println("not a leap year");
        }
    }
}
