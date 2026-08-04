//left rotation
public class array14 {
    static void rev(int a[], int i, int j) {
        while (i < j) {
            a[i] = a[i] + a[j] - (a[j] = a[i]);
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 4, 5 };
        int n = a.length;
        int r = 2;
        // r = r % n;
        // rev(a, 0, r - 1);
        // rev(a, r, n - 1);
        // rev(a, 0, n - 1);
        // for (int i = 0; i < n; i++) {
        //     System.out.print(a[i] + " ");
        // }
        leftswap(a, n, r);
    }
    static void leftswap(int a[], int n, int r) {
        int[] new1 = new int[n];
        
        for (int i = r, j = 0; i < n; i++, j++) {
            new1[j] = a[i];
        }

        for (int i = n - r, j = 0; i < n; i++, j++) {
            new1[i] = a[j];
        }

        for (int x : new1) {
            System.out.print(x + " ");
        }
    }
}