package leetCode.ArraysRelatedLeetcode;

public class MaximumSubProduct {

	/*
	 * 152. Maximum Product Subarray Attempted Medium Topics premium lock icon
	 * Companies Given an integer array nums, find a subarray that has the largest
	 * product, and return the product.
	 * 
	 * The test cases are generated so that the answer will fit in a 32-bit integer.
	 * 
	 * Note that the product of an array with a single element is the value of that
	 * element.
	 * 
	 * 
	 * 
	 * Example 1:
	 * 
	 * Input: nums = [2,3,-2,4] Output: 6 Explanation: [2,3] has the largest product
	 * 6. Example 2:
	 * 
	 * Input: nums = [-2,0,-1] Output: 0 Explanation: The result cannot be 2,
	 * because [-2,-1] is not a subarray.
	 * 
	 * 
	 * Constraints:
	 * 
	 * 1 <= nums.length <= 2 * 104 -10 <= nums[i] <= 10 The product of any subarray
	 * of nums is guaranteed to fit in a 32-bit integer.
	 */

	public static void main(String[] args) {
		int[] nums = { 1, 3, 2, -2, -6 };
		int res = MaximumSubProduct.maxProduct(nums);
		System.out.println(res);

	}

	public static int maxProduct(int[] nums) {

		int maxProd = nums[0];
		int minProd = nums[0];
		int result = nums[0];

		for (int i = 1; i < nums.length; i++) {

			int num = nums[i];
			int tempMax = maxProd;

			maxProd = Math.max(num, Math.max(num * maxProd, num * minProd));

			minProd = Math.min(num, Math.min(num * tempMax, num * minProd));

			result = Math.max(result, maxProd);
		}

		return result;
	}

}
