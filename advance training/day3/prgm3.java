
// max sum of sub array
public class prgm3 {

    static int bruteforce(int[] arr) {
        int max=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    // System.out.print(arr[k]+"");
                    sum=sum+arr[k];
                }
                if(sum>max){
                    max=sum;
                }
                // System.out.print("->"+sum);
                // System.out.println();
            }
        }
        return max;
    }
    static int bruteforce2(int[] arr) {
            int max = 0;
            for (int i = 0; i < arr.length; i++) {
                int sum = 0;
                for (int j = i; j < arr.length; j++) {
                    sum = sum + arr[j];
                    max = Math.max(sum, max);
                }
            }
            return max;
        }
        static int kadance(int []arr){
            int sum=0,max=Integer.MIN_VALUE;
            for(int i=0;i<arr.length;i++){
                sum=sum+arr[i];
                max=Math.max(sum,max);
                if(sum<0){
                    sum=0;
                }
            }
            return max;
        }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3};
        System.out.println(kadance (arr));
    }
}

//to print max sum and the max sum array
// public class prgm3 {

//     static int bruteforce(int[] arr) {
//         int max = Integer.MIN_VALUE;
//         int start = 0, end = 0;

//         for (int i = 0; i < arr.length; i++) {
//             for (int j = i; j < arr.length; j++) {
//                 int sum = 0;
//                 for (int k = i; k <= j; k++) {
//                     sum += arr[k];
//                 }
//                 if (sum > max) {
//                     max = sum;
//                     start = i;
//                     end = j;
//                 }
//             }
//         }

//         // Print the maximum subarray
//         System.out.print("Maximum subarray: ");
//         for (int i = start; i <= end; i++) {
//             System.out.print(arr[i] + " ");
//         }
//         System.out.println();

//         return max;
//     }

//     public static void main(String[] args) {
//         int arr[] = {1,2,3};
//         System.out.println("Maximum sum: " + bruteforce(arr));
//     }
// }
