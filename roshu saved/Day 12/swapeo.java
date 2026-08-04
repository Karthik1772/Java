

public class swapeo {
    public static void main(String[] args) {
        int a[]={9,6,2,5,7};
        int n=a.length;
        for(int i=0;i<n;i++){
                if(a[i]%2==0){
                    System.out.print(i+" ");
                }
               
            }
            for(int i=0;i<n;i++){
                if(a[i]%2!=0){
                    System.out.print(i+" ");
                }
               
            }
        
        }
    }