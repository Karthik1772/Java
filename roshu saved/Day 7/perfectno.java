public class perfectno {
    static void per(int c){
        for(int i=0;i<c;i++){
        int sum = 0;
        int a = 1;
        while(a<i){
            if(i%a==0){
                sum = sum+a;
            }
            a++;
        }
        if(i == sum){
            System.out.println(i);
        }
    }
    }
    public static void main(String[] args) {
        per(100);
        
    }
}
