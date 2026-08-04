public class home1 {
    static void pattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if((j==0 && i>=n/2)||i==n/2 || (j==n-1 && i>=n/2)||(i==n-1 && j<=n/2 && j<=n/4) ||(i-j==-n/2)||i+j==n/2 || (j==n/4 && i>=3*n/4)
						||(j==n/2 && i>=3*n/4)||(i==3*n/4 && j>=n/4 && j<=n/2)|| (i==n-1 && j>=n/2) ||(j==5*n/8 && i>=5*n/8 && i<=3*n/4)||(j==7*n/8 && i<=3*n/4 && i>=5*n/8)
						||(i==5*n/8 && j>=5*n/8 && j<=7*n/8)||(i==3*n/4 && j>=5*n/8 && j<=7*n/8) ||(j==3*n/4 && i>=5*n/8 && i<=3*n/4)|| (i==11*n/16 && j>=5*n/8 && j<=7*n/8))
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();

        }
        return;

    }

    public static void main(String[] args) {

        pattern(30);
    }
}