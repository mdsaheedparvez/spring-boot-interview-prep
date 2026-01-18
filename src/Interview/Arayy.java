package Interview;

public class Arayy {

	public static void main(String[] args) {
		Arayy sr = new Arayy();
		int [] nums = {4,5,6,7,0,1,2};
//		System.out.println(sr.search(nums, 0));
		System.out.println(sr.maxProduct(nums));
		   

	}
//	 public int search(int[] nums, int target) {
//	        int cnt = -1;
//	        for(int i =0;i<nums.length;i++){
//	            if(nums[i] == target){
//	                cnt = i;
//	            }
//	        }
//	        return cnt;
//	    }
	 
	//maximum sub array
	 public int maxProduct(int[] nums) {
	        int currSum = nums[0]; int maxSum = nums[0];
	        for(int i=1; i < nums.length; i++){
	            currSum = Math.max(nums[i],currSum + nums[i]);
	            maxSum = Math.max(maxSum,currSum);
//	             if(nums[i] == 0){
//	                maxSum = 0;
//	                break;
//	            }
//	            else if(nums.length == 1){
//	                 maxSum = nums[i];
//	                break;
//	            }
	        }
	        return maxSum;
	    }

}
