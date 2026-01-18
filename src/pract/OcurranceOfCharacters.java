package pract;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class OcurranceOfCharacters {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter new sentence");
		String nextLine = sc.nextLine();
		OcurranceOfCharacters oc = new OcurranceOfCharacters();
		oc.checkOccirenc(nextLine);
	}

	private void checkOccirenc(String str) {
		Map<String,Integer> mp = new HashMap<>();
		int count = 0;
		for(int i =0;i<str.length();i++) {
			char charAt = str.charAt(i);
			String string = Character.toString(charAt);
			if(mp.containsKey(string)) {
				Integer integer = mp.get(string);
				//mp.put(string, integer+1);
				mp.put(string,mp.getOrDefault(string, 0)+1);
			}
			else {
				mp.put(string,count+1);
			}
		}
//	
		Map<Character,Integer> mp1 = new HashMap<Character, Integer>();
		for(int k=0;k<str.length();k++) {
		mp1.put(str.charAt(k),mp1.getOrDefault(str.charAt(k), 0)+1)	;
		
		}
		System.out.println(mp);
		System.out.println("jhgdghj");
		System.out.println(mp1);
	
	}
}
