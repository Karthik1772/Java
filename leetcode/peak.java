//852. Peak Index in a Mountain Array
//You are given an integer mountain array arr of length n where the values increase to a peak element and then decrease.
//Return the index of the peak element.

import java.util.Scanner;

public class peak {
    public static int peakIndexInMountainArray(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return i;
            }
        }
        return -1;
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
        System.out.println("Peak Index: " + peakIndexInMountainArray(arr));
    }
}
