
public class PronicNum {
    static void pronic(int n){
        int x =1;
        int d =0;
        while(x!= n){
            if(x*(x+1)==n){
                d = 1;
                x++;
            }
            else {
                x++;
            }
        }
        if(d==1){
            System.out.println("pronic");
        } else {
            System.out.println("no");
        }
    }
    public static void main(String[] args) {
        int n = 13;
         pronic(n);

    }
}