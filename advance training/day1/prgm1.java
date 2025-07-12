//given an array find the elements which is repeated only once others repeated twice for unsorted array

public class prgm1 {
    static int bruteforce(int arr[]){
        int unique=0;
		for(int i=0;i<arr.length;i++){
		    boolean isunique=true;
		    for(int j=i+1;j<arr.length;j++){
		        if(arr[i]==arr[j]){
		            isunique=false;
		            break;
		        }
		    }
		    if(isunique){
		        unique=arr[i];
		        break;
		    }
		}
        return unique;
    }
    static int xor(int arr[]){
        int unique = 0;
        for (int i = 0; i < arr.length; i++) {
            unique ^= arr[i];
        }
        return unique;
    }
    public static void main(String[] args) {
		int[] array = {2, 3, 5, 3, 2};
		
		// System.out.print(bruteforce(array));
        System.out.print(xor(array));
	}
}
