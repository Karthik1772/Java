
public class largest3 {
    public static void main(String[] args) {
        int arr[]={1,2,9,10,15,20};
        int n=arr.length;
        int max=arr[0],max1=arr[0],max2=-1,min=arr[0],min1=arr[n-1],min2=arr[n-1];
        for(int i=1;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
                if(arr[i]<min){
                min=arr[i];
        }
    }
    for(int i=1;i<n;i++){
        if(arr[i]!=max&&arr[i]>max1){
            max1=arr[i];
        }
            if(arr[i]!=min&&arr[i]<min1){
            min1=arr[i];
    }
}
        for(int i=0;i<n;i++){
            if(arr[i]!=max && arr[i]!=max1 &&arr[i]>max2){
            max2=arr[i];
            }
            if(min!=arr[i]&&min1!=arr[i]&&min2>arr[i]){
                min2=arr[i];
            }
        }
        
        System.out.println(max2);
        System.out.println(min2);
       
    }
           
}