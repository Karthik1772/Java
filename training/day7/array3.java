//prgm to product the elements of array
public class array3 {
    static int prod() {
        int prod = 1;
        int arr[] = { 1, 2, 3, 4, 5 };
        for (int i = 0; i < arr.length; i++) {
            prod = prod * arr[i];
        }
        return prod;
    }

    public static void main(String[] args) {
        System.out.print(prod());
    }
}
