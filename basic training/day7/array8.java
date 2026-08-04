//max min
public class array8 {
    static int max(int arr[]) {
        int max = Integer.MIN_VALUE; //-2147483648 Smallest int value
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    static int min(int arr[]) {
        int min = Integer.MAX_VALUE; //2147483647 Largest int value
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        System.out.println(max(arr));
        System.out.println(min(arr));

    }
}
