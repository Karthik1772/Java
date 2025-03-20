
import java.util.Arrays;
import java.util.Scanner;

//binary search in 2d array

public class binary {
    static int search(int arr[][],int target){
        int left =0;
        int right=arr.length-1;
        while(left<=right){
            int mid=(left+right)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]<target){
                left=mid+1;
            }
            else{
                right = mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the number of row elements ");
        int n = scan.nextInt();
        System.out.println("enter the number of column elements ");
        int m = scan.nextInt();
        int arr[][] = new int[n][m];
        System.out.println("enter the elements");
        for(int row =0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                arr[row][col]=scan.nextInt();
            }
        }
        System.out.println("enter the search element");
        int target = scan.nextInt();
        // for(int row =0;row<arr.length;row++){
        //     for(int col=0;col<arr[row].length;col++){
        //         System.out.print(arr[row][col]+" ");
        //     }
        //     System.out.println();
        // }
        for(int row =0;row<arr.length;row++){
                System.out.println(Arrays.toString(arr[row]));
        }
        search(arr,target);
    }
}
