public class sq {
    public static void main(String[] args) {
        int arr[] = {9,2,6,1,4,5};
        int n = arr.length;
        for(int i=0;i<n;i++)
            arr[i]=arr[i]*arr[i];
            for(int i=0;i<n;i++)
            System.out.print(arr[i]+" ");
    }
}
