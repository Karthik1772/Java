//print a pattern, in place of start use the data inside the array
public class array10 {

    static void array(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            pat(arr[i]);
            System.out.println();
        }
    }

    static void pat(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i - j > 0)
                    System.out.print(n);
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int arr[] = { 5, 4, 3 };
        array(arr);
    }
}