public class pattern3 {
    static void p2(int n){
		for(int i=0;i<n;i++){
		for(int j=0;j<=n;j++){
		if( i>0&&i-j>0&&i+j<n-1)
		System.out.print(n/2-j);
		else
		System.out.print(" ");
		}
		System.out.println();
		}
		return;
		}
        public static void main(String[] args) {
            p2(5);
        }

}
