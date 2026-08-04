
public class armstrong{
    static int length(int i){
        int count = 0;
        int b = 0;
        while(i>0) {
            int len = i % 10;
            b = count++;
            i/=10;
        }
        return count;
    }
    static void arm(int c){
        int ctr=0;
        for(int i=1;i<c;i++){
            int n = i;
        int temp = n; 
        int len = length(n);
        int sum = 0;
        while(n>0){
            int a = n%10;
            int d = (int) Math.pow(a,len);
            sum = sum+d;
            n/=10;
        }
        if(temp == sum){
            System.out.println(temp); //print first nth number
           // ctr++;

        }
        // if(ctr == c){
        //     System.out.println(temp); //print nth armstrong number
        //     break;
        // }
    }
        
    }
    public static void main(String[] args) {
        arm(200);
        
    }
}