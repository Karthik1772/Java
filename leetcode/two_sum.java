//

import java.util.Arrays;
import java.util.Scanner;

public class two_sum {
    public static int[] sadd(int[] numbers, int target) {
        for(int i=0;i<numbers.length-1;i++){
            for(int j=i+1;i<numbers.length;j++){
                if(numbers[i]+numbers[j]==target){
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("enter the number of elements");
        int n= scan.nextInt();
        int arr[]=new int[n];
        System.out.println("enter the elements");
        for(int i=0;i<n;i++){
            arr[i]=scan.nextInt();
        }
        System.out.println("eneter the target element");
        int tar=scan.nextInt();
        System.out.println(Arrays.toString(sadd(arr,tar)));
    }
}
