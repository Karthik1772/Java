public class reverse {
    static void disp(char a[]){
        for (int i = 0; i < a.length; i++)
            System.out.print(a[i]);
        System.out.println();
    }
    static void rev(char ch[],int i,int j){
        while(i<j){
            char t=ch[i];
            ch[i]=ch[j];
            ch[j]=t;
            i++;j--;
        }
    }
    static void wordrev(char a[]){
        int n=a.length;
        int s=0;
        for(int i=0;i<n;i++){
            if(a[i]==' '){
                rev(a,s,i-1);
                s=i+1;
            }
            if(i==n-1)
            rev(a,s,i);
           
        }
    }
    public static void main(String[] args) {
        String s="what is your name";
        char ch[]=s.toCharArray();
        disp(ch);
        wordrev(ch);
        disp(ch);
    }
}