class pat1{
    static void pattern(int n)
    {
        for(int i =0;i<n;i++)
        {
            for(int j=0;j<n;j++){
                if(i==j)
                System.out.print("*");
                else
                System.out.print(" ");  
           }
        System.out.println(" ");
        
        }
        return;
        
    }
    public static void main(String[] args) {
        
        pattern(5);
    }
}