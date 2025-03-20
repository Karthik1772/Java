
import java.util.Arrays;
import java.util.Scanner;

//binary search
public class binarySearch {
    static int search(int arr[],int target){
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
        System.out.println("enter the number of elements ");
        int n = scan.nextInt();
        int arr[] = new int[n];
        System.out.println("enter the elements");
        for(int i =0;i<arr.length;i++){
            arr[i]=scan.nextInt();
        }
        System.out.println("enter the search element");
        int target = scan.nextInt();
        Arrays.sort(arr);
        if(search(arr, target)!=1){
            System.out.println("element found on index "+search(arr,target));
        }else{
            System.out.println("element not found");
        }
    }

}
