// Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.
import java.util.*;

public class sum3 {
    static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        
        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {  // Fixed condition
                for (int k = j + 1; k < nums.length; k++) {
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        List<Integer> triplet = Arrays.asList(nums[i], nums[j], nums[k]);
                        if (!result.contains(triplet)) { // Avoid duplicates
                            result.add(triplet);
                        }
                    }
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] num = new int[5];

        System.out.println("Enter 5 numbers: ");
        for (int i = 0; i < num.length; i++) {
            num[i] = scan.nextInt();
        }
        scan.close();

        System.out.println("Triplets: " + threeSum(num));
    }
}
