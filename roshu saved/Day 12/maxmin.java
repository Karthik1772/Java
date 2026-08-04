public class maxmin {
        static int  max1(int a[]){
            int max=0;
            for(int i=0;i<a.length;i++){
                if(a[i]>max){
                    max=a[i];
                }   
            }
            return max;
        }
        static int  min1(int a[]){
            int min = max1(a);
            for(int i=0;i<a.length;i++){
                if(a[i]<min){
                    min=a[i];
                }   
            }
            return min;
        }
         
        
        public static void main(String[] args) {
            int a[] = {1,2,3,0,4,5};
           System.out.println(max1(a)); 
           System.out.println(min1(a));
        }
    
    }

