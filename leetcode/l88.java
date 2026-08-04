
import java.util.Arrays;

public class l88 {

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int pos = 0;
        for (int i = 0; i < nums1.length; i++) {
            if (nums1[i] == 0) {
                pos = i;
                break;
            }
        }
        System.out.println(pos);
        for (int i = pos, j = 0; j < nums2.length; i++, j++) {
            nums1[i] = nums2[j];
        }
    }

    public static void main(String[] args) {

        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;

        int[] nums2 = {2, 5, 6};
        int n = 3;

        merge(nums1, m, nums2, n);

        System.out.println(Arrays.toString(nums1));
    }
}
