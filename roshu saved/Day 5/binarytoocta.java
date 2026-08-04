
public class binarytoocta {
	static int bd(int n) {
		int a=1;
		int sum=0;
		while(n>0) {
			sum=sum+(n%10)*a;
			a=a*2;
		n=n/10;	
		}
	return sum;	
	}
	static long bo(long n) {
		long sum=0;
		long b=1;
	    while(n>0) {
		    long a=n%1000;
		    sum=sum+bd((int)a)*b;
		    b*=10;
		    
		    n=n/1000;
	    }
	return sum;
	}

	public static void main(String[] args) {
		long o=101011;
		System.out.println(bo(o));
		
	}

}