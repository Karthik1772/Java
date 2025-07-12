//number reverse in index
public class array7 {
    static void ireverse(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = reverse(arr[i]);
            System.out.print(arr[i] + " ");
        }
    }

    static int reverse(int num) {
        int rem;
        int rev = 0;
        while (num > 0) {
            rem = num % 10;
            rev = rev * 10 + rem;
            num = num / 10;
        }
        return rev;
    }

    public static void main(String[] args) {
        int arr[] = { 12, 13, 14, 15, 16 };
        ireverse(arr);
    }
}
