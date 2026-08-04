public class rev {
    static void funrev(int arr[]){
        for(int i=0;i<arr.length;i++){
            arr[i]= reverse(arr[i]);
            System.out.println(arr[i]+" ");
        }
        
    }
    static int reverse(int num)
    {
        int c =0;
            while(num!=0){
                int b = num%10;
                c = c*10 + b;
                num =num/10;
            }
            return c;
        }
        
    
    public static void main(String[] args) {
        int arr[] = {10,25,38};
        funrev(arr);
        
    }
}
