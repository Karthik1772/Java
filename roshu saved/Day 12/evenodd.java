public class evenodd {
    static void eve(int a[]){
        for(int i=0;i<a.length;i++){
            if(a[i]%2==0){
                System.out.print(a[i]+" ");

        }
    }
    System.out.println();
    
}   
    static void odd(int a[]){
        for(int i=0;i<a.length;i++){
            if(a[i]%2!=0){
                System.out.print(a[i]+" ");
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5};
        eve(a);
        odd(a);
    }

}
