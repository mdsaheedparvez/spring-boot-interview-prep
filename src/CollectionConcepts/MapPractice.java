package CollectionConcepts;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Stream;

public class MapPractice {

	public static void main(String[] args) {
		
		//map practice
		Map<String, Float> mapp = new HashMap<>();
		mapp.put("Harry potter", 5f);
		mapp.put("Narnia", 2F);
		mapp.put("Avenger", 5f);
		mapp.put("Secrets", 6f);
		mapp.put("See", 6f);
		mapp.put("Shaktima", 10f);
		mapp.put("AryaMan", 6.7f);
		
		mapp.entrySet().removeIf(abh -> abh.equals("6f"));
		
		mapp.forEach((y,z)->{
			System.out.println("Movie name: "+y+" its rating: "+z);
		});
		
		System.out.println("--------------------");
		//linkedhashmap
		
		Map<String, Integer> mapp1 = new LinkedHashMap<>();
		mapp1.put("Harry potter", 5);
		mapp1.put("Narnia", 2);
		mapp1.put("Avenger", 5);
		mapp1.put("Secrets", 6);
		mapp1.put("See", 6);
		mapp1.put("Shaktima", 10);
		
		mapp1.forEach((x,y)->{
			System.out.println("The name of movie is "+x+" and its rating is "+y);
		});
		
		System.out.println("-----Rating wise--------------");
		
		
		
		
		
		System.out.println("-----ascending wise--------------");
		//Tree Map
		Map<String, Integer> trem = new TreeMap<>();
		trem.put("Harry potter", 5);
		trem.put("Narnia", 2);
		trem.put("Avenger", 5);
		trem.put("Secrets", 6);
		trem.put("See", 6);
		trem.put("Shaktima", 10);
		
		trem.forEach((x,y)->{
			System.out.println("Movie Name:"+x+" rating: "+y);
		});
		
//		Stream.of(trem).sorted((x,y)->);
//	)
		
		
	}

}
