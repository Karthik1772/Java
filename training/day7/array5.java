//linear search
public class array5 {
    static void linearSearch(int arr[], int key) {
        int flag = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                flag++;
                System.out.println("Element fount at index " + i);
                break;
            }
        }
        if (flag == 0) {
            System.out.println("element not found");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4 };
        int key = 4;
        linearSearch(arr, key);
    }
}
