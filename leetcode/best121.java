public class best121 {
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(best(prices));;
    }
    static int best(int[] prices) {
        int max =  Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 1; i < prices.length; i++) {
            min = Math.min(min, prices[i]);
        }
        int pos = indexvalue(prices, min);
        for(int i=pos;i<prices.length;i++){
            max= Math.max(max,prices[i]);
        }
        System.out.println(min);
        System.out.println(max);
        return max-min;
    }
    static int indexvalue(int[] nums,int target){

        int index = -1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                index = i;
                break;
            }
        }
        return index;
    }
}
