import java.util.Arrays;
import java.util.Scanner;

public class smaller1365 {
    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int result[] = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            result[i]=count(nums, nums[i]);
        }return result;
    }
    static int count(int nums[],int n){
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<n){
                count++;
            }
        }
        return count;
    }  
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the number of elements");
        int n = scan.nextInt();
        int arr[] = new int[n];
        System.out.println("enter the elements");
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(arr)));
    }
}
