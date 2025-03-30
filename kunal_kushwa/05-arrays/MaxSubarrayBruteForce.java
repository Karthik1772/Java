public class MaxSubarrayBruteForce {
    public static int maxSubarraySum(int[] arr) {
        int n = arr.length;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int currentSum = 0;
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k]);
                    currentSum = currentSum + arr[k];
                }
                System.out.print(" ");
                maxSum = Math.max(maxSum, currentSum);
            }
            System.out.println();
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        System.out.println("Maximum Subarray Sum: " + maxSubarraySum(arr));
    }
}
