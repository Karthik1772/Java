public class neon {
    public static void main(String[] args) {
        int n = 9;
        int sum = 0;
        int square = n * n;
        while (square > 0) {
            sum = sum + square % 10;
            square = square / 10;
        }
        if (sum == n) {
            System.out.println("neon number");
        } else {
            System.out.println("not a neon number");
        }
    }   
}
