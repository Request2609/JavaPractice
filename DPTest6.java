
class Solutions {
    public int maxSubArray(int[] nums) {
    	
    	if(nums.length == 0)return 0 ;
    	
    	if(nums.length == 1)return nums[0] ;
    	
    	int res = 0 ;
    	int result = Integer.MIN_VALUE;
    	for(int i=0;i<nums.length;i++) {
    		
    		res = Math.max(nums[i],res+nums[i]);
    		result = Math.max(result, res) ;
    	}
    	return result ;
    }
}
public class DPTest6 {
	public static void main(String []args) {
		
		int a[] = {-2,1,-3,4,-1,2,1,-5,4} ;
		System.out.println( new Solutions().maxSubArray(a)) ;
	}
}
