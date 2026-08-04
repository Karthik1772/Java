
public class abhi {

    public static void A(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(j==0||i==0||j==n-1||i==n/2){
                    System.out.print("*");
                    
                }else{
                    System.out.print(" ");
                }
                
            }
            System.out.println();
            
        }
    }
    
    public static void b(int n){
        System.out.println();
        System.out.println();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(j==0||i==0||j==n-1||i==n/2||i==n-1){
                    System.out.print("*");
                    
                }else{
                    System.out.print(" ");
                }
                
            }
            System.out.println();
        }
    }
    public static void c(int n){
        System.out.println();
        System.out.println();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(j==0||i==0||i==n-1){
                    System.out.print("*");
                    
                }else{
                    System.out.print(" ");
                }
                
            }
            System.out.println();
        }
        
    }
    public static void d(int n){
        System.out.println();
        System.out.println();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(j==0||i==0||i==n-1||j==n-1){
                    System.out.print("*");
                    
                }else{
                    System.out.print(" ");
                }
                
            }
            System.out.println();
        }
        
    }
    public static void e(int n){
        System.out.println();
        System.out.println();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(j==0||i==0||i==n-1||i==n/2){
                    System.out.print("*");
                    
                }else{
                    System.out.print(" ");
                }
                
            }
            System.out.println();
        }
    }
    public static void f(int n){
        System.out.println();
        System.out.println();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(j==0||i==0||i==n/2){
                    System.out.print("*");
                    
                }else{
                    System.out.print(" ");
                }
                
            }
            System.out.println();
        }
    }
    public static void h(int n){
        System.out.println();
        System.out.println();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(j==0||i==n/2||j==n-1/4||j==n-1){
                    System.out.print("*");
                    
                }else{
                    System.out.print(" ");
                }
                
            }
            System.out.println();
        }
    }  public static void i(int n){
        System.out.println();
        System.out.println();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(j==n-1/4||j==n/2||i==0||i==n-1){
                    System.out.print("*");
                    
                }else{
                    System.out.print(" ");
                }
                
            }
            System.out.println();
        }
    }
    public static void j(int n){
        System.out.println();
        System.out.println();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(j==n-1/4||j==n/2&&i!=n-1||(j==0&&i!=n-1&&i>n/2)||i==0||(i==n-1&&j!=0&&j<n/2)){
                    System.out.print("*");
                    
                }else{
                    System.out.print(" ");
                }
                
            }
            System.out.println();
        }
    }
    public static void k(int n){
        System.out.println();
        System.out.println();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(j==0||i+j==n/2||i-j==n/2){
                    System.out.print("*");
                    
                }else{
                    System.out.print(" ");
                }
                
            }
            System.out.println();
        }
    }
    public static void l(int n){
        System.out.println();
        System.out.println();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(j==0||i==n-1){
                    System.out.print("*");
                    
                }else{
                    System.out.print(" ");
                }
                
            }
            System.out.println();
        }
    }
    public static void m(int n){
        System.out.println();
        System.out.println();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(j==0||(i-j==0&&i<n/2+1)||j==n-1||i+j==n-1&&i<n/2+1){
                    System.out.print("*");
                    
                }else{
                    System.out.print(" ");
                }
                
            }
            System.out.println();
        }
    }
    public static void n(int n){
        System.out.println();
        System.out.println();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(j==0||i-j==0||j==n-1){
                    System.out.print("*");
                    
                }else{
                    System.out.print(" ");
                }
                
            }
            System.out.println();
        }
    }
    public static void o(int n){
        System.out.println();
        System.out.println();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if((j==0&&i!=0&&i!=n-1)||(i==0&&j!=0&&j!=n-1)||(j==n-1&&i!=0&&i!=n-1)||i==n-1&&j!=0&&j!=n-1){
                    System.out.print("*");
                    
                }else{
                    System.out.print(" ");
                }
                
            }
            System.out.println();
        }
    }
  
    public static void p(int n){
        System.out.println();
        System.out.println();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(j==0||i==0&&j!=n-1||j==n-1&&i!=0&&i<n/2||i==n/2&&j!=n-1){
                    System.out.print("*");
                    
                }else{
                    System.out.print(" ");
                }
                
            }
            System.out.println();
        }
    }
    public static void q(int n){
        System.out.println();
        System.out.println();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==0&&j!=0&&j!=n-2&&j!=n-1||j==0&&i!=0&&i!=n-1&&i!=n-2||i==n-2&&j!=n-1&&j!=0||j==n-2&&i!=0&&i!=n-1||i-j==0&&j>n/2||i-j==0&&i+j==n-1){
                    System.out.print("*");
                    
                }else{
                    System.out.print(" ");
                }
                
            }
            System.out.println();
        }
    }
    public static void r(int n){
        System.out.println();
        System.out.println();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(j==0||i==0&&j!=n-1||j==n-1&&i!=0&&i<n/2||i==n/2&&j!=n-1||i-j==0&&i>n/2){
                    System.out.print("*");
                    
                }else{
                    System.out.print(" ");
                }
                
            }
            System.out.println();
        }
    }
    public static void s(int n){
        System.out.println();
        System.out.println();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==0&&j!=0||j==0&i<n/2&&i!=0&&i!=n-1||i==n-1&&j!=n-1||i==n/2&j!=0&&j!=n-1||j==n-1&&i!=n-1&&i>n/2){
                    System.out.print("*");
                    
                }else{
                    System.out.print(" ");
                }
                
            }
            System.out.println();
        }
    }
    public static void t(int n){
        System.out.println();
        System.out.println();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(j==n-1/4||j==n/2||i==0){
                    System.out.print("*");
                    
                }else{
                    System.out.print(" ");
                }
                
            }
            System.out.println();
        }
    }
    public static void u(int n){
        System.out.println();
        System.out.println();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if((j==0&&i!=0&&i!=n-1)||(j==n-1&&i!=0&&i!=n-1)||i==n-1&&j!=0&&j!=n-1){
                    System.out.print("*");
                    
                }else{
                    System.out.print(" ");
                }
                
            }
            System.out.println();
        }
    }
    public static void v(int n){
        System.out.println();
        System.out.println();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i-j==0&&i<n/2+1||i+j==n-1&&i<n/2){
                    System.out.print("*");
                    
                }else{
                    System.out.print(" ");
                }
                
            }
            System.out.println();
        }
        }
    public static void w(int n){
        System.out.println();
        System.out.println();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(j==0||j==n-1||i+j==n-1&&i>n/2||i-j==0&&i>n/2||i-j==0&&i+j==n-1){
                    System.out.print("*");
                    
                }else{
                    System.out.print(" ");
                }
                
            }
            System.out.println();
        }
    }
    public static void x(int n){
        System.out.println();
        System.out.println();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i-j==0||i+j==n-1){
                    System.out.print("*");
                    
                }else{
                    System.out.print(" ");
                }
                
            }
            System.out.println();
        }
    }
    public static void y(int n){
        System.out.println();
        System.out.println();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(j==n/2&&i>n/2||i-j==0&&i<n/2||i+j==n-1&&i<n/2||i-j==0&&i+j==n-1){
                    System.out.print("*");
                    
                }else{
                    System.out.print(" ");
                }
                
            }
            System.out.println();
        }
    }
    public static void z(int n){
        System.out.println();
        System.out.println();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==0||i==n-1||i+j==n-1){
                    System.out.print("*");
                    
                }else{
                    System.out.print(" ");
                }
                
            }
            System.out.println();
        }
    }
    public static void g(int n){
        System.out.println();
        System.out.println();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if((j==0&&i!=0&&i!=n-1)||(i==0&&j!=0&&j!=n-1)||(j==n-1&&i!=n-1&&i>n/2)||i==n-1&&j!=0&&j!=n-1||i==n/2&&j>n/2&&j!=n-1){
                    System.out.print("*");
                    
                }else{
                    System.out.print(" ");
                }
                
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        int i =7;
        
        A(i);
        b(i);
        c(i);
        d(i);
        e(i);
        f(i);
        g(i);
        h(i);
        i(i);
        j(i);
        k(i);
        l(i);
        m(i);
        n(i);
        o(i);
        p(i);
        q(i);
        r(i);
        s(i);
        t(i);
        u(i);
        v(i);
        w(i);
        x(i);
        y(i);
        z(i);
       
    }
}