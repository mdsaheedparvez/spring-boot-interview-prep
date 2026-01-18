package pract;
//package pract;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//
//public class Arrayspractice {
//
//	public static void main(String[] args) {
//			int A[] = {1,2,3};
//			int[] B = {5,6,7,8};
//			List<Integer> asListd = new ArrayList<>();
//			for(int i :A) {
//				asListd.add(i);
//			}
//			List<Integer> asListd1 = new ArrayList<>();
//			for(int i :B) {
//				asListd1.add(i);
//			}
//			System.out.println(asListd.add(asListd1.get(0)));
//			System.out.println(asListd1.remove(0));
//			
//			
//			System.out.println(asListd);
//			System.out.println(asListd1);
//            
//			List<int[]> asList = Arrays.asList(A);
//			System.out.println(asList);
//	}
//
//}


import java.util.*;
import java.util.Arrays;

public class Arrayspractice {
    public static void main(String[] args) {
    	
        int[] arrayOfIntegers = {1, 2, 3, 4, 5};
        List<Integer> ab = new ArrayList<>();
        
        for(int b : arrayOfIntegers) {
        	ab.add(b);
        }
        System.out.println(ab);
        System.out.println(Arrays.toString(arrayOfIntegers));
        
    }
}

