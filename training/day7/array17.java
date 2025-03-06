//binary search
import java.util.Scanner;

public class array17 {
    static void binarySearch(int arr[], int search) {
        int n = arr.length;
        int begin = 0, end = n - 1;
        int pos = -1;

        while (begin <= end) {
            int mid = (begin + end) / 2;
            if (arr[mid] == search) {
                pos = mid;
                break;
            } else if (search < arr[mid]) {
                end = mid - 1;
            } else {
                begin = mid + 1;
            }
        }

        if (pos >= 0) {
            System.out.println("Position = " + pos);
        } else {
            System.out.println("Elements is not found");
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the number of elements");
        int n = scan.nextInt();
        int arr[] = new int[n];
        System.out.println("enter the elements");
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        System.out.println("enter the search element");
        int search = scan.nextInt();
        binarySearch(arr, search);

    }
}
