
public class pattern28 {
    public static void main(String[] args) {
        int n=7;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i-j>=0&&i+j<=n-1)
                System.out.print(n/2-j);
                else
                System.out.print(" ");
            }
            System.out.println(" ");
        }
    
}
}