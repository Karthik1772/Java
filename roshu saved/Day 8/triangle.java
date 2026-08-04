public class triangle {

    static void pattern(int n)
        {
            for(int i =0;i<n;i++)
            {
                for(int j=0;j<n;j++){
                    if(i==n-1 || i+j==n-1 && j<n/2 || i-j==0 && i>n/2)
                    System.out.print("*");
                    else
                    System.out.print(" ");  
               }
            System.out.println(" ");
            
            }
            return;
            
        }
        public static void main(String[] args) {
            
            pattern(10);
        }
}

