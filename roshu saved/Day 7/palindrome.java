
public class palindrome {
    static void pal(int c){

        
        for(int i=0;i<c;i++){
            int rem = 0;
            int n = i;
            int temp =i;
        while(n!=0){
            int a = n%10;
            rem = rem*10 + a;
            n = n/10;
        }
        if(temp == rem){
            System.out.println(temp);
        }
    }

    }
    public static void main(String[] args) {
        pal(100);
    }
}