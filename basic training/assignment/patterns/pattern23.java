
public class pattern23 {
    public static void main(String[] args) {
        int n = 5 ; 

        for (int i = 0; i < n; i++) {
            for(int j=0;j<2*n;j++){
                if(i+j>=n-1&&j<=n-1||i-j>=1-n&&j>=n-1){
                    System.out.print((char)(65+j-n+i+1));
                }
                else
                System.out.print(" ");

            }
           

            System.out.println(); 
        }
    }
    
}