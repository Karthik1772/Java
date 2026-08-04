public class swap {
    static void swapping(int a[]){
        int n = a.length;
        for(int i=0;i<n-1;i+=2){
        a[i] = a[i] + a[i+1];
        a[i+1] = a[i] - a[i+1];
        a[i] = a[i] - a[i+1];
        
        }
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
       
    }
    public static void main(String[] args) {
        int a[] = {1,3,5,6,5,8};
        swapping(a);
    }
}
