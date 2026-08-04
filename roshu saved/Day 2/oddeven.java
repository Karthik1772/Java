import java.util.Scanner;

class oddeven{
    public static void main(String[] args) {
        int a;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a number :");
        a = obj.nextInt();
        System.out.println( a % 2 == 0? "even" : "odd");
        System.out.println(a%2 == 0 ? "even": "odd");
        System.out.println(((a|1)>a) ? "even": "odd");
        System.out.println(a == (a>>1)<<1?"even":"odd");
        System.out.println((a^1)==(a+1)?"even":"odd");
    }
}