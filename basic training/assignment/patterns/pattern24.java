
public class pattern24 {
    public static void main(String[] args) {
        int n = 5 ; 

        for (int i = 0; i <n; i++) {
            for(int j=0;j<n;j++){
                if(!(i+j<n/2||i-j>n/2||i+j>3*(n/2)||i-j<-(n/2))){
                    if(i<n/2){
                        System.out.print((char)(65+(-n/2+i+j)));
                    }
                    else{
                        System.out.print((char)(65+n/2-i+j));
                    }
                }
                else {
                System.out.print(" ");
                }
            }
           

            System.out.println(); 
        }
    }
    
}