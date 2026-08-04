public class main {
    public static void main(String[] args) {
        int a[] = {14, 15, 14, 3, 21, 1}; //
        int n = a.length;
        int max[] ={a[0],a[0],a[0]};
        for (int i = 1; i < n; i++) {
            if (a[i] != max[0]) {
                if (a[i] > max[0]) {
                    max[2] = max[1];
                    max[1] = max[0];
                    max[0] = a[i];
                } else if (a[i] > max[1] || max[0] == max[1]) {
                    max[2] = max[1];
                    max[1] = a[i];
                } else if (a[i] > max[2] || max[1] == max[2]) {
                    max[2] = a[i];
                }
            }
        }
            System.out.println("1st Max: " + max[0]);
            System.out.println("2nd Max: " + max[1]);
            System.out.println("3rd Max: " + max[2]);
       
    }
}