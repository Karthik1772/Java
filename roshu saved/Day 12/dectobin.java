public class dectobin {
    static void dcbn(int arr[]){
        for(int i=0;i<arr.length;i++){
            arr[i]= db(arr[i]);
            System.out.println(arr[i]+" ");
        }
    }
    static int db(int n){
        int a = 1;
        int sum = 0;
        while(n>0){
            sum += n%2*a;
            a = a*10;
            n = n/2;
        }
        return sum;
    }
    public static void main(String[] args) {
        int arr[] = {8,7};
        dcbn(arr);
    }
}
