public class Main1
{
static void fun(int n){
for(int i=0;i<n;i++){
for(int j=0;j<n;j++){
if((i+j==3*n/2 || i+j==n/2 || i-j==-(n/2)|| i-j==n/2 || i==n/2+n/4||j==3*n/4 || i==n/4 ||j==n/4 ||i==n/2 || j==n/2 || j*i==0 ||i-j==0 ||i==n-1 || i+j==n-1 || j==n-1))
System.out.print("*");
else
System.out.print(" ");
}
System.out.println();
}
return;
}
public static void main(String[] args) {
int n=21;
fun(n);
}
}