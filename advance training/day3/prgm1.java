
import java.util.ArrayList;
import java.util.List;

public class prgm1 {

    static int globalSum = 0;

    public static int subsetXORSum(int[] nums) {
        globalSum = 0; 
        List<Integer> l = new ArrayList<>();
        subset(nums, nums.length, 0, l);
        return globalSum;
    }

    public static void subset(int[] nums, int n, int pos, List<Integer>curent) {
        if (pos == n) {
            int val = 0;
            for (Integer ele :curent) {
                val ^= ele;
            }
            globalSum += val;
            return;
        }
       curent.add(nums[pos]);
        subset(nums, n, pos + 1,curent);
       curent.remove(curent.size() - 1);
        subset(nums, n, pos + 1,curent);
    }

    public static void main(String[] args) {
        int[] nums = {1, 3};
        int result = subsetXORSum(nums);
        System.out.println("Sum of XORs of all subsets: " + result);
    }
}

// //subsetgeneration
// import java.util.ArrayList;
// public class prgm1 {
//     public static void generateSubsets(int[] nums, int n, int pos, ArrayList<Integer> current) {
//         if (pos == n) {
//             System.out.println(current);
//             return;
//         }
//         current.add(nums[pos]);
//         generateSubsets(nums, n, pos + 1, current);
//         current.remove(current.size() - 1);
//         generateSubsets(nums, n, pos + 1, current);
//     }
//     public static void main(String[] args) {
//         int[] nums = {1, 3, 5};
//         ArrayList<Integer> current = new ArrayList<>();
//         generateSubsets(nums, nums.length, 0, current);
//     }
// }
