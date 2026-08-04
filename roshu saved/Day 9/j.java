public class j {

static void fun(int n){
    for(int i=0;i<n;i++){
    for(int j=0;j<n;j++){
    if((i+j==n/2||i-j==-(n/2)||j>=n/4&&j<=3*(n/4)&&i==n/4))
    System.out.print("*");
    else
    System.out.print(" ");
    }
    System.out.println();
    }
    return;
    }    
public static void main(String[] args){
int n=25;
fun(n);
}
}