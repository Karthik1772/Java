public class diamond {
        static void pattern(int n)
                {
                    for(int i =0;i<n;i++)
                    {
                        for(int j=0;j<n;j++){
                            if( i+j==n/2 || i-j==-n/2 || i+j==3*(n/2) || i-j==n/2 ||
                             i+j==3*(n/4) && j<=n/2 && i<=n/2 ||
                              i-j==-n/4 && j>=n/2 && i<=n/2 ||
                               i-j==n/4 && i>=n/2 && j<=n/2 ||
                                i+j==(n-1)+n/4 && i>=n/2 && j>=n/2)
                            System.out.print("* ");
                            else
                            System.out.print("  ");  
                       }
                    System.out.println();
                    
                    }
                    return;
                    
                }
                public static void main(String[] args) {
                    
                    pattern(21);
                }
        }
