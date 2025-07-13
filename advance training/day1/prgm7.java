
//find the max sum by selecting any set of elements such that no 2 adjacent numbers are chosen
public class prgm7 {

    static int max(int arr[], int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return arr[0];
        }

        int[] dp = new int[n];
        dp[0] = arr[0];
        dp[1] = Math.max(arr[0], arr[1]);

        for (int i = 2; i < n; i++) {
            dp[i] = Math.max(dp[i - 1], dp[i - 2] + arr[i]);
        }

        return dp[n - 1];
    }

    public static void main(String[] args) {
        int arr[] = {4, 3, 8, 5, 3, 8};
        System.out.println(max(arr, arr.length));
    }
}
