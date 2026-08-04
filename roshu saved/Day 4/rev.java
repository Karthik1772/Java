public class rev {
    public static void main(String[] args) {
        int n =1234;
        int sum = 0;
        while (n!=0) {
            int a = n%10;
            sum = sum*10 + a;
            n = n / 10;
        }
        System.out.println(sum);
    }
}
