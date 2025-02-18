import java.util.Scanner;
//find the max no in a given no
public class num_log11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the number");
        int num = scan.nextInt();
        int max=0,rem=0;
        while(num!=0){
            rem=num%10;
            if(rem>max){
                max=rem;
            }
            num=num/10;
        }
        System.out.println(max);
    }
}
