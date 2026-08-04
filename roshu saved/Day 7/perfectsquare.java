public class perfectsquare{
    static void per(int c){
        for (int j=0; j<c; j++){
        int n = j; 
        int i = 1;
        while (n>0){
        n = n-i;
        i = i+2;
        }
        if(n==0){
            System.out.println(j);
          }
        }
    }
    public static void main(String[] args){
        per(100);
    }
}

