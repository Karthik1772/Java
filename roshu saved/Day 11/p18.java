
public class p18 {
    public static void main(String[] args) {
        int n = 5; 
    for (int i = 0; i <n; i++) {
        for(int j=0;j<n;j++){
            if(!(i+j<n/2||i-j>n/2||i+j>3*(n/2)||i-j<-(n/2))){
                int val = (i < n / 2) ? (i - j + n / 2) : (n / 2 - j + i - 2);
                if (val < 0) val = 0;
                System.out.print((char)(65 + val));
            } else {
                System.out.print(" ");
            }
    }
       

        System.out.println(); 
    
}
    

    }
}