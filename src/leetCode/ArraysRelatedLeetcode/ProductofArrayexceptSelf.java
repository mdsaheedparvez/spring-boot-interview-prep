package leetCode.ArraysRelatedLeetcode;

import java.util.Arrays;

/*238. Product of Array Except Self
Attempted
Medium
Topics
premium lock icon
Companies
Hint
Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].

The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.

You must write an algorithm that runs in O(n) time and without using the division operation.

 

Example 1:

Input: nums = [1,2,3,4]
Output: [24,12,8,6]
Example 2:

Input: nums = [-1,1,0,-3,3]
Output: [0,0,9,0,0]
 

Constraints:

2 <= nums.length <= 105
-30 <= nums[i] <= 30
The input is generated such that answer[i] is guaranteed to fit in a 32-bit integer.
 

Follow up: Can you solve the problem in O(1) extra space complexity? (The output array does not count as extra space for space complexity analysis*/

public class ProductofArrayexceptSelf {

	public static void main(String[] args) {
		int [] nums = {8,2,3,4};
		int[] productExceptSelf = ProductofArrayexceptSelf.productExceptSelf(nums);
		System.out.println(Arrays.toString(productExceptSelf));

	}
	
	    public static int[] productExceptSelf(int[] nums) {
	        int n = nums.length;
	        int []res = new int[n];
	        int productOfAllBeforeCurrent = 1;
	        int productOfAllAfterCurrent = 1;
	        for(int i = 0;i<n;i++){
	            res[i]=productOfAllBeforeCurrent;
	            productOfAllBeforeCurrent *=nums[i];
	        }
	        System.out.println(Arrays.toString(nums));
	        System.out.println(Arrays.toString(res));

	          for(int i = n-1;i>=0;i--){
	            res[i] *=productOfAllAfterCurrent;
	            productOfAllAfterCurrent *=nums[i];
	        }
	        System.out.println(Arrays.toString(nums));
	        System.out.println(Arrays.toString(res));
	        return res;
	        
	    }

}
