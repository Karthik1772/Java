class pat{
        static void pattern(int n)
        {
            for(int i =0;i<2*n-1;i++)
            {
                for(int j=0;j<n;j++){
                    if(i-j>0 && i+j<=2*n-1)
                    if(i<n)
                    System.out.print(n-1-i+j);
                    else if(i>=n)
                    System.out.print(i-(n-1)+j);  
               }
            System.out.println();
            
            }
            return;
            
        }
        public static void main(String[] args) {
            
            pattern(5);
        }
    }
