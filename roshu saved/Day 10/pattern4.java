public class pattern4 {
    static void p3(int n){
		for(int i=0;i<n;i++){
		for(int j=0;j<=n;j++){
		if( i>0&&i-j>0&&i+j<n-1)
			if(i<=n/2) {
		System.out.print((n/2+j-i));
			}
			else {
				System.out.print(j+i-n/2);
			}
		else
		System.out.print(" ");
		}
		System.out.println();
		}
		return;
		}
public static void main(String[] args) {
    p3(10);
}
}
