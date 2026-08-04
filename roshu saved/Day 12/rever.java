
public class rever {
    static void rev(int a[],int i ,int j) {
        while(i<j){
            a[i]=a[i]+a[j]-(a[j]=a[i]);
            i++;j--;
        }
    }
    public static void main(String[] args) {
        int a[]= {1,2,3,4,5,6};
        int n = a.length;
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
     }
    }
}