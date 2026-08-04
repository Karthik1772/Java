
public class IndexEvenOdd {
    public static void main(String[] args) {
        int a[]={9,6,2,5,7};
        int n=a.length;
        for(int i=0;i<n;i++){
                if(i%2==0){
                    System.out.print(a[i]+" ");
                }
               
            }
            for(int i=0;i<n;i++){
                if(i%2!=0){
                    System.out.print(a[i]+" ");
                }
               
            }
        
        }
    
}