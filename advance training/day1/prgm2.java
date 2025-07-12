//given an array find the elements which is repeated only once others repeated twice for sorted array
public class prgm2 {
    static int search(int arr[]){
        int l=0,h=arr.length-1;
        while(l<h){
            int m= l+(h-l)/2;
            if(arr[m]==arr[m+1]){
                m=m-1;
            }
            if((m-l-1)%2!=0){
                h=m;
            }
            else{
                l=m-1;
            }
        }
        return arr[l];
    }
    public static void main(String[] args) {
        int arr[]={1,1,2,2,7};
        System.out.println(search(arr));
    }
}
