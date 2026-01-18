package Hard134Challenge;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//agenda is to find the number of word vowels and upercvase
	//lower case and frequency of each character

public class VeryImportant {
	
	public static void main(String[] args) {
		 String str = "Hi bro kaise hai tu Bada bhai Saddam";
		 int word = 0;
		 int upp = 0;
		 int low = 0;
		 int vow =0; int val = 1;
		//Occurance of character
		 HashMap<String, Integer> map = new HashMap<String, Integer>();
		 
		 for(int i = 0;i<str.length(); i++) {
			 if(Character.isWhitespace(str.charAt(i))){
				 word++;
			 }
			 if(Character.isUpperCase(str.charAt(i))){
				 upp++;
			 }
			 if(Character.isLowerCase(str.charAt(i))){
				 low++;
			 }
			 char lc = Character.toLowerCase(str.charAt(i));
			 if(lc == 'a' || lc == 'e' || lc == 'i' || lc == 'o' || lc == 'u'){
				 vow++;
			 }
			 String string = Character.toString(str.charAt(i));
			 if(!map.containsKey(string)) {
				 map.put(string, val);
			 	}
			 else {
//				 Integer integer = map.get(string);
				 map.put(string, map.get(string)+1);
			 }
		 }
		 
		 System.out.println("Words count "+word);
		 System.out.println("Upper Case Words count "+upp);
		 System.out.println("Lower Case Words count "+low);
		 System.out.println("Vowels Words count "+vow);
		 System.out.println("Each Words count "+map);
		 
//		 Stream<HashMap<String, Integer>> of = Stream.of(map).collect(Collectors.groupingBy(mp->mp.ge,Collectors.toList()));
//		 System.out.println(of);
		 List<Entry<String, Integer>> clt = map.entrySet().stream().sorted(Map.Entry.comparingByValue()).collect(Collectors.toList());
		 clt.forEach(x->System.out.println(x.getKey()+" "+x.getValue()));
	}

}
