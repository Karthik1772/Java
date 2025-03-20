//1539. Kth Missing Positive Number
//Given an array arr of positive integers sorted in a strictly increasing order, and an integer k.
//Return the kth positive integer that is missing from this array.

import java.util.ArrayList;
import java.util.Scanner;

public class kth1539 {
    static int search(int arr[],int target){
        for(int i =0;i<arr.length;i++){
            if(arr[i]==target){
                return arr[i];
            }
        }return 0;
    }
    public static int findKthPositive(int[] arr,int k) {
        ArrayList<Integer> list = new ArrayList<>();
        int i=1;
        int l=arr[arr.length-1];
        while(i<=l){
            if(i!=search(arr,i)){
                list.add(i);
            }i++;
        }
        int newa[]=new int[list.size()];
        for(int j=0;j<list.size();j++){
            newa[j]=list.get(j);
        }
        System.out.println(newa[k-1]);
        return -1;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int let[] = { 2, 4, 6, 8, 10 };
        int k = scan.nextInt();
        findKthPositive(let,k);
    }
}
