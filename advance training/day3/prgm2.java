
import java.util.ArrayList;

//sub array
public class prgm2 {

    static void bruteforce(ArrayList<Integer> arr) {
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(arr.get(k) + " ");
                }
                System.out.print(" , ");
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3};
        ArrayList<Integer> array = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            array.add(arr[i]);
        }
        bruteforce(array);
    }
}
