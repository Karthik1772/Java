import java.util.Scanner;

public class pattern9 {
    static void pattern(int n){
		for(int i=0;i<n;i++){
		for(int j=0;j<=n;j++){
		if( i>0&&i-j>0&&i+j<n-1)
		System.out.print((char)(65+n/2-j-1));
		else
		System.out.print(" ");
		}
		System.out.println();
		}
		}

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        pattern(n);
    }
}
