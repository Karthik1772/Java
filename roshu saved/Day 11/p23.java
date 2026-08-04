
public class p23 {
    public static void main(String[] args) {
        int n=7;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i-j<=0&&i+j>=n-1)
                System.out.print((char)(65+(-(n/2-j))));
                else
                System.out.print(" ");
            }
            System.out.println(" ");
        }
    
}
    
}