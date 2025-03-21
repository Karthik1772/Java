public class array15 {
    static void rev(int a[], int i, int j) {
        while (i < j) {
            a[i] = a[i] + a[j] - (a[j] = a[i]);
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 4, 5, 6 };
        int n = a.length;
        int r = 7;
        r = r % n;
        rev(a, n - r, n - 1);
        rev(a, 0, n - r - 1);
        rev(a, 0, n - 1);
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }
}