public class linear {
    static void linear1(int arr[],int k,int n){
        for(int i=0;i<n;i++)
            if(arr[i]==k){
                System.out.println(i);
                return;
            }
            System.out.println(-1);
            return ;
        }

        public static void main(String[] args) {
            int arr[] = {1,2,3,4,5};
            int n = arr.length;
            int k = 5;
            linear1(arr, k,n);
        }
    }

