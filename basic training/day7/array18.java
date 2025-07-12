
//selection sort
import java.util.Scanner;

public class array18 {
    static void selectionSort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    arr[i] = arr[i] + arr[j] - (arr[j] = arr[i]);
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static void revSelectionSort(int arr[]) {
        int n = arr.length;
        for (int i = n - 1; i > 0; i--) {
            for (int j = i - 1; j > -1; j--) {
                if (arr[i] < arr[j]) {
                    arr[i] = arr[i] + arr[j] - (arr[j] = arr[i]);
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
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
        revSelectionSort(arr);
    }
}
