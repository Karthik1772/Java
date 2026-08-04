public class pattern7 {
    static void p6(int n){
		for(int i=0;i<n;i++){
		for(int j=0;j<=n;j++){
		if((i>0&&j==n-i))
		System.out.print("*");
		else
		System.out.print("");
		}
		System.out.println();
		}
		return;
		}
		public static void main(String[] args) {
		p6(9);
		}

    }