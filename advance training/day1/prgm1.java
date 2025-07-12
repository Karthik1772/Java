//given an array find the elements which is repeated only once others repeated twice
public class prgm1 {
    static int single(int arr[]){
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
    public static void main(String[] args) {
		int[] array = {2, 3, 5, 3, 2};
		
		System.out.print(single(array));
	}
}
