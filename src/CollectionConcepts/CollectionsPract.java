package CollectionConcepts;

import java.util.*;
public class CollectionsPract {

	public static void main(String[] args) {
		
		//type safe collection
		ArrayList<String> arr = new ArrayList<String>();
		arr.add("abhishek");
		arr.add("sgivam");
		arr.add("kiran");
		arr.add("kiran");    	
		
		
//		System.out.println(arr.get(2));
//		arr.remove("kiran");
//		System.out.println(arr);
//		System.out.println(arr.contains("sgivam"));
		
		//remove and set
//		arr.set(1, "pandey");
		
//		add and index
		arr.add("dhhd");
		arr.add(1, "kiii");
		System.out.println(arr);
		
		//remove all elements
//		arr.clear();System.out.println(arr);
		
		
		//vector
//		Vector<String> vec = new Vector<>();
//		vec.addAll(arr);
//		System.out.println("vector "+vec);
		
		
		
		
		//un type
//		LinkedList li = new LinkedList();
//        li.add("abhi");
//        li.add(23);
//        li.add(3454.54d);
//        System.out.println(li);
		
		//set
		
		HashSet<Double> gh = new HashSet<Double>();
		gh.add(23.65);
		gh.add(453.78);
		gh.add(8589.23);
		gh.add(8589.23);
		System.out.println(gh);
		
		TreeSet<Double> tr = new TreeSet<>();
		tr.addAll(gh);
		System.out.println(tr);
		
		
		
		
	}

}
