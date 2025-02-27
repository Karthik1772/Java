//prgm to sum the elements of array
public class array2 {
    static int sum(){
        int sum =0;
        int arr[]={1,2,3,4,5};
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.print(sum());
    }
}
