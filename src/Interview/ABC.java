package Interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//You are given an array prices where fruits[I] is the price of a given fruit on the ith day.
//You want to maximize your profit by choosing a single day to buy one fruit and choosing a different day in the future to sell that fruit. Assuming fruits will never get rotten.
//Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.

public class ABC {

	public static void main(String[] args) {
	
	
	//5
//	int sum = 0;int max= 0;
//	List<Integer> sb = new ArrayList<>(); 
	
//	for(int i =0;i<ar.length;i++) {
//		for(int j =1;j<ar.length;j++) {
//			if(ar[j]>ar[i]) {
//				sum = ar[j] - ar[i];
////				sb.add(sum);
//				max= Math.max(max,sum);
//			}
//			
//		}
//	}
//	System.out.println(max);
//	  Collections.sort(sb);
//	   max = sb.get(sb.size()-1);
//	   System.out.println(max);
//   
//	int sum = 0;
//	for(int i =0;i<ar.length;i++) {
//		if(ar[i]< ar[i+1]) {
//			sum = Math.max(sum, ar[i+1] - ar[i]);
//		}
//	}
//	int[] prices = { 7, 1, 5, 3, 6, 4 };
//	int maxProfit = Integer.MIN_VALUE;
//	int minm = Integer.MAX_VALUE;
//	for (int price : prices) {
//		minm = Math.min(minm, price);
//		maxProfit = Math.max(maxProfit, price - minm);
//	}
//	System.out.println(maxProfit);
		int[] ar = {1,3,2,4,5,5,2,8};
		Arrays.sort(ar);
		System.out.println(Arrays.toString(ar));
		int max = Integer.MIN_VALUE; int min = Integer.MAX_VALUE;
		for(int pr : ar) {
			min = Math.min(pr, min);
			max = Math.max(max, pr - min);
		}
		System.out.println(min);
		System.out.println(max);
	}

}


