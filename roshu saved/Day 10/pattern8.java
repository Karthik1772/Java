public class pattern8 {
    static void p4(int n){
		for(int i=0;i<n;i++){
		for(int j=0;j<=n;j++){
		if( i>0&&i-j>0&&i+j<n-1)
		System.out.print((char)(65+n/2-j-1));
		else
		System.out.print(" ");
		}
		System.out.println();
		}
		return;
		}
public static void main(String[] args) {
    p4(15);
}
}
