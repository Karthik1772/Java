public class vowel {
    static void disp(char a[]) {
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]);
        }
        System.out.println();
    }
    
    public static  void upper(char a[]){
        int n=a.length;
        disp(a);
        for(int i=0;i<n;i++) {
        if(a[i]=='a'||a[i]=='o'||a[i]=='i'||a[i]=='e'||a[i]=='u') {
             a[i]=(char)(a[i]-32);
         }         
     }
 }

    public static void main(String[] args) {
        String S = "what is your name";
        char ch[]=S.toCharArray();
        upper(ch);
        disp(ch);
    }

}
