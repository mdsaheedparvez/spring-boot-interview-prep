package pract;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class TwoMap {

	public static void main(String[] args) {
      
		Map<String,Integer> map1 = new HashMap<String, Integer>();
		map1.put("Aman",1);
		map1.put("Kiran",2);
		map1.put("Dhiraj",3);
		
		Map<String,Integer> map2 = new HashMap<String, Integer>();
		map2.put("Yamini",4);
		map2.put("Amini",5);
		map2.put("Niraj",6);
		
		TwoMap twoMap = new TwoMap();
		boolean checkTwoMap = twoMap.checkTwoMap(map1,map2);
		System.out.println(checkTwoMap);
		
	}

	private static<K,V> boolean checkTwoMap(Map<K, V> map1, Map<K, V> map2) {

		if(map1.size() != map2.size())
			return false;
		
		for(Map.Entry<K,V> mp :map1.entrySet()) {
			K key = mp.getKey();
			V value = mp.getValue();
			if(!map2.containsKey(key) ||  !map2.get(key).equals(value)) {
				return false;
			}
			
		}
		return true;
	}

	

}
