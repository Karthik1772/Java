public class sort {
    public static void main(String[] args) {
        int a[]={3,9,11,21,60};
        int b[]={4,6,91,112,455};
        int i=0,j=0,p=0;

        int n1 = a.length;
        int n2 = b.length;
        int m[]=new int [n1+n2];

        while(i<n1 && j<n2){
            if(a[i] < b[j])
                m[p++] = a[i++];
            else 
            m[p++] = b[j++];    
        }

        while(i<n1)
        m[p++] = a[i++];
        while(j<n2)
        m[p++] = b[j++];

        for(int k=0;k<(n1+n2);k++){
            System.out.print(m[k]+" ");
        }
    }
}
