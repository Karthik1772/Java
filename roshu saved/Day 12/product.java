public class product {

    static int prod()
    {
        int pro=1;
        int arr[] = {1,2,3,4,5};
        for(int i=0;i<arr.length;i++)
        {
            pro *= arr[i];
        }
        return pro;
    }
    public static void main(String[] args) {
        System.out.println(prod());
    }
}
