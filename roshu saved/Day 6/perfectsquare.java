public class perfectsquare {
    public static void main(String[] args) {
        int n = 5;
        int i =1;
        while(n>0){
            n = n-i;
            i = i+2;
        }
        if(n==0){
            System.out.println("Perfect square");
        }
        else{
            System.out.println("not perfect square");
        }
    }
}
