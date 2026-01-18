package CollectionConcepts;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;
import java.util.stream.Stream;

public class MapPractice {

	public static void main(String[] args) {
		
		//map practice
		HashMap<String, Integer> mapp = new HashMap<>();
		mapp.put("Harry potter", 5);
		mapp.put("Narnia", 2);
		mapp.put("Avenger", 5);
		mapp.put("Secrets", 6);
		mapp.put("See", 6);
		mapp.put("Shaktima", 10);
		
		mapp.forEach((x,y)->{
			System.out.println("Movie Name:"+x+" rating: "+y);
		});
		
		System.out.println("--------------------");
		//linkedhashmap
		
		LinkedHashMap<String, Integer> mapp1 = new LinkedHashMap<>();
		mapp1.put("Harry potter", 5);
		mapp1.put("Narnia", 2);
		mapp1.put("Avenger", 5);
		mapp1.put("Secrets", 6);
		mapp1.put("See", 6);
		mapp1.put("Shaktima", 10);
		
//		mapp1.forEach((x,y)->{
//			System.out.println("Movie Name:"+x+" rating: "+y);
//		});
		
		System.out.println("-----Rating wise--------------");
		
		
		
		
		
		System.out.println("-----ascending wise--------------");
		//Tree Map
		TreeMap<String, Integer> trem = new TreeMap<>();
		trem.put("Harry potter", 5);
		trem.put("Narnia", 2);
		trem.put("Avenger", 5);
		trem.put("Secrets", 6);
		trem.put("See", 6);
		trem.put("Shaktima", 10);
		
//		trem.forEach((x,y)->{
//			System.out.println("Movie Name:"+x+" rating: "+y);
//		});
		
//		Stream.of(trem).sorted((x,y)->);
//	)
		
		
	}

}
