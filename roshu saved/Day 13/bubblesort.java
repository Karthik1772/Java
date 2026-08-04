public class bubblesort {
        static void selectionSort(int a[], int l){
            for (int i = 0; i < l - 1; i++){
                int minIndex = i;
                for (int j = i + 1; j < l; j++){
                    if (a[j] < a[minIndex]){  
                        minIndex = j;
                    }
                }
                int temp = a[minIndex];
                a[minIndex] = a[i];
                a[i] = temp;
            }
        }
    
        public static void main(String[] args){
            int a[] = {10, 50, 45, 12, 56};
            int l = a.length;
    
            selectionSort(a, l);
            for (int i = 0; i < l; i++){
                System.out.print(a[i] +" ");
            }
        }
    }
    
