public class sum {

    static int summ()
    {
        int sum=0;
        int arr[] = {9,2,6,1,4,5};
        for(int i=0;i<arr.length;i++)
        {
            sum += i;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(summ());
    }
}
