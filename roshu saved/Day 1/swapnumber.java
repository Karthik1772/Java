
class swapnumber {
	public static void main(String[] args)
	{
		int x = 5, y = 10;
		x = x ^ y;
		y = x ^ y;
		x = x ^ y;
		System.out.println("The value of x is " + x + " and the value of y is " + y);
	
    if(x>y){
        System.out.print("x is greater");
    }
    else {
        System.out.println("y is greater");
    }
}
}
