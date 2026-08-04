public class count {

    static void disp(char a[]) {
        for(int i=0;i<a.length;i++) {
            System.out.print(a[i]);
        }
        System.out.println();
    }
    
        public static  void num(char a[]) {
            int n=a.length;
            int s=0;
            disp(a);
            for(int i=0;i<n;i++) {
                s=s+1;
                if(i==n-1||a[i+1]==' ') {
                    a[i]=(char)(48+s);
                    s=-1;
                }
            }	
        }
    public static void main(String[] args) {
        String S = "what is your name";
        char ch[]=S.toCharArray();
        num(ch);
        disp(ch);
    }

}