public class upper {
		static void disp(char a[]) {
			for(int i=0;i<a.length;i++){
				System.out.print(a[i]);
			}
			System.out.println();
		}
		
        public static  void upper1(char a[]){
            int n=a.length;
            disp(a);
            for(int i=0;i<n;i++) {
            if(97<=a[i] &&a[i]<=122 && a[i]!=' '){
                 a[i]=(char)(a[i]-32);
                }         
         }
     }

		public static void main(String[] args) {
			String S = "what is your name";
			char ch[]=S.toCharArray();
			upper1(ch);
			disp(ch);
		}

	}
