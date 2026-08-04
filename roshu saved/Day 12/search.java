public class search {
    public static void main(String[] args) {
        int arr[] = {9,2,6,1,4,5};
        int n = arr.length;
        int key=56;
        int flag=0;
        for(int i=0;i<n;i++)
            if(arr[i]==key){
                flag++;
                System.out.println(i);
                break;
            }
            if(flag==0)
            {
                System.out.println(-1);
            }
            for(int i=0;i<n;i++)
            System.out.print(arr[i]+" ");
    }
}
