//swap using 3 and 2
public class array12 {
    static void swap3(int arr[]){
        int temp;
        for(int i=0;i<arr.length-1;i+=2){
            temp = arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
            
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    static void swap2(int arr[]){
        for(int i=0;i<arr.length-1;i+=2){
            arr[i] = arr[i]+arr[i+1];
            arr[i+1]=arr[i]-arr[i+1];
            arr[i]=arr[i]-arr[i+1];
            
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[] = { 2,1,4,3,5 };
        swap2(arr);
    }
}
