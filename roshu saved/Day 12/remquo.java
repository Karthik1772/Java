public class remquo {

    static void disp(int a[])
    {
        for(int i=0;i<a.length;i++)
        System.out.println(a[i]+" ");
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {9,2,60,1,4};
        int n = arr.length;
        int q[] = new int[n];
        int r[] = new int[n];
        for(int i=0;i<n;i++){
            r[i]=arr[i] % 10;
            q[i] = arr[i] /10;
          }
          disp(arr);
    }
}

