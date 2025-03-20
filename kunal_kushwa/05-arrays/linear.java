
import java.util.Arrays;
import java.util.Scanner;

//linear search in 2d array

public class linear {
    static void search(int arr[][],int target){
        int index=-1;
        for(int row =0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                if(arr[row][col]==target){
                    System.out.println("Element found at index [" + row + "][" + col + "]");
                    return;
                }
            }
        }
        System.out.println("element not found");
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
