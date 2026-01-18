package CollectionConcepts;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Traverse {

	public static void main(String[] args) {

		ArrayList<String> arr = new ArrayList<String>();
		arr.add("abhishek");
		arr.add("sgivam");
		arr.add("kiran");
		arr.add("kiran");
		
		//for each
		for(String hj : arr  ) {
			System.out.print(hj+"\t"+hj.length()+"\t");
			StringBuffer sb = new StringBuffer(hj);
			System.out.println(sb.reverse());
		}
		
		
		System.out.println("---------------------------");
		//iterator:  -> Forward Traversing
		
		Iterator<String> itr = arr.iterator();
		while(itr.hasNext()) {
			String next = itr.next();
			System.out.println(next);
		}
		
		System.out.println("---------------------------");
		
		//list Iterator -->backwad traversing (size needs to pass)
		ListIterator<String> listitr = arr.listIterator(arr.size());
		
//		while(listitr.hasNext()) {
//			String next2 = listitr.next();
//			System.out.println(next2);
//		}
		
		while(listitr.hasPrevious()) {
			String next2 = listitr.previous();
			System.out.println(next2);
		}
		
		System.out.println("------------------sdfsdf---------");
		//for each
		arr.forEach(x->{
			System.out.println(x);
		});
		
		
		
		
	}
	
	
	
	
	
	
	

}
