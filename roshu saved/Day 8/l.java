public class l {
        static void pattern(int n)
            {
                for(int i =0;i<n;i++)
                {
                    for(int j=0;j<n;j++){
                        if(j==0 || i==n-1)
                        System.out.print("*");
                        else
                        System.out.print(" ");  
                   }
                System.out.println(" ");
                
                }
                return;
                
            }
            public static void main(String[] args) {
                
                pattern(15);
            }
    }
