public class twopointer {
    static void rev(int a[],int i,int j){
        while(i<j){
            a[i]=a[i]+a[j]-(a[j]=a[i]);
            i++;j--;
        }
    }
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6}; //5 4 3 2 1
        int n=a.length;
        rev(a,0,n-1);
    }
}
