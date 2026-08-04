class pat{
    static void pattern(int n)
    {
        int j;
        for(int i =0;i<n;i++)
        {
            for(j=0;j<i+1;j++){
                
                System.out.print("*");
            
            
        }
            System.out.println(" ");
        
        }
        
    }
    public static void main(String[] args) {
        
        pattern(5);
    }
}