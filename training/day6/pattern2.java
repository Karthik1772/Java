// *
//  *
//   *
//    *
//     *
//      *
//       *
//        *
//         *

import java.util.Scanner;

public class pattern2 {
    static void pattern(int num) {
        for (int i = 0; i < num; i++) {// col
            for (int j = 1; j < num; j++) {// row
                if (i - j == 0) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        pattern(n);
    }
}
