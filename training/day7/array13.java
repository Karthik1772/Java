//replace the data with even index position 1st then with odd positions 
public class array13 {
    static void array(int arr[]){
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                arr[i]=i;
            }
            else{
                arr[i]=i;
            }
        }
        // for(int i=0;i<arr.length;i++){
        //     if(arr[i]%2==1){
        //         arr[i]=i;
        //     }
        // }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        array(arr);
        // Even(arr);
        // odd(arr);
    }
}
