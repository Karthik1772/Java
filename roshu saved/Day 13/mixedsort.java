public class mixedsort {
    public static void main(String[] args) {
        int a[]= {97,48,32,57,65,122,90};
        int n = a.length;
        int m[] = new int[n];

        int j = n-1,p=0;
        for(int i=0;i<n;i++){
            if(a[i]<=a[j]){
                m[p++] = a[i];
            }
        }
        for(int k=0;k<n;k++){
            System.out.print(m[k]+" ");
    }
    }
}