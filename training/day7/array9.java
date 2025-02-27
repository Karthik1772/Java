//prgm to binary value of the elements in an array
public class array9 {
    static void binary(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = db(arr[i]);
            System.out.print(arr[i] + " ");
        }
    }

    static int db(int n) {
        int a = 1;
        int sum = 0;
        while (n > 0) {
            sum += n % 2 * a;
            a = a * 10;
            n = n / 2;
        }
        return sum;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4};
        binary(arr);
    }
}