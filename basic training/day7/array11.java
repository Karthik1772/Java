//Replace the value in array with length of element
public class array11 {
    static void ireverse(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = length(arr[i]);
            System.out.print(arr[i] + " ");
        }
    }

    static int length(int num) {
        int rev = 0;
        while (num > 0) {
            rev++;
            num = num / 10;
        }
        return rev;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 13, 141, 1511, 16111 };
        ireverse(arr);
    }
}
