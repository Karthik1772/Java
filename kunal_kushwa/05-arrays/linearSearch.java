//linear search

import java.util.Scanner;

public class linearSearch {
    static void search(int arr[],int target){
        int index=-1;
        for(int i =0;i<arr.length;i++){
            if(arr[i]==target){
                index=i;
            }
        }
        if(index>-1){
            System.out.println("element found in the index "+index);
        }else{
            System.out.println("element not found");
        }
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
        search(arr,target);
    }
}
