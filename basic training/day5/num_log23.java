
//ramanujan no
import java.util.Scanner;

public class num_log23 {

    static void ramanujan(int range) {
        for (int i = 1; i * i * i < range; i++) {
            for (int j = i + 1; j * j * j < range; j++) {
                int s1 = i * i * i + j * j * j;
                for (int k = i + 1; k * k * k < range; k++) {
                    for (int l = k + 1; l * l * l < range; l++) {
                        int s2 = k * k * k + l * l * l;
                        if (s1 == s2) {
                            System.out.println(i + "^3 + " + j + "^3 == " + k + "^3 + " + l + "^3 = " + s1);
                        }
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int range = scan.nextInt();
        ramanujan(range);
    }
}
