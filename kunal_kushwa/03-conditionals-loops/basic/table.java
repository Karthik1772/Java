
import java.util.Scanner;

public class table {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt(),res;
        for(int i = 1;i<=10;i++){
            res = n*i;
            System.out.println(n + "X" + i + "=" + res);
        }
    }
}
