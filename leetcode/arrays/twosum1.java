
import java.util.Arrays;
import java.util.Scanner;

//Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

public class twosum1 {
    static int[] Sum(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if((nums[i]+nums[j])==target){
                    int arr[]={i,j};
                    return arr;
                }
            }
        }
        return null;
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int[] num = new int[5];
        for(int i=0;i<num.length;i++){
            num[i]=scan.nextInt();
        }
        int target = scan.nextInt();

        if (Sum(num, target) != null) {
            System.out.println(Arrays.toString(Sum(num, target)));
        } else {
            System.out.println("No valid pair found.");
        }

    }
}
