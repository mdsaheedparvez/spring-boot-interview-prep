package CollectionConcepts;

import java.util.*;

public class Traverse {

	public static void main(String[] args) {

		List<String> arr = new ArrayList<String>();
		arr.add("abhishek");
		arr.add("sgivam");
		arr.add("kiran");
		arr.add("kiran");
		
		//for each
		for(String hj : arr  ) {
			System.out.print(hj+"\t"+hj.length()+"\t");
			StringBuilder sb = new StringBuilder(hj);
			System.out.println(sb.reverse());
		}
		
		
		System.out.println("---------------------------");
		//iterator:  -> Forward Traversing
		
		Iterator<String> iterator = arr.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		System.out.println("---------------------------");
		
		//list Iterator -->backwad traversing (size needs to pass)
		ListIterator<String> listitr = arr.listIterator(arr.size());
		
		while(listitr.hasPrevious()) {
			System.out.println(listitr.previous());
		}
		
		System.out.println("------------------sdfsdf---------");
		//for each
		arr.forEach(x->{
			System.out.println(x);
		});
		
		
		
		
	}
	
	
	
	
	
	
	

}
