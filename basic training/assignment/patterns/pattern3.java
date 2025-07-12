// ******   * 
//  *   *  **
//   *  * * *
//    * **  *
//     **   *
// **********
// *  * **    
// * *  * *
// **   *  *
// *    *****
import java.util.Scanner;

public class pattern3 {
    static void pattern(int n) {
        for (int i = 0; i < n; i++) {// row
            for (int j = 0; j < n; j++) {// col
                if (j==n/2||i==n/2||i-j==0||i+j==n-1||i==0&&j<n/2||j==0&&i>n/2||i==n-1&&j>n/2||j==n-1&&i<n/2)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println(" ");

        }

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        pattern(n);
    }
}
