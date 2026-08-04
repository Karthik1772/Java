public class ramanujan {
    public static void main(String[] args) {
        int n = 100000;
        for(int i=1;i*i*i<n;i++){
            for(int j =i+1;j*j*j<n;j++){
                int s1=(i*i*i)+(j*j*j);
                for(int k =i+1;k*k*k<n;k++){
                    for(int l = k+1;l*l*l<n;l++)
                    if(s1==(k*k*k)+(l*l*l)){
                        System.out.println(i+" "+j+"=="+k+" "+l+" "+s1);
                        System.out.println();
                    }
                }
            }
        }
    }
}
