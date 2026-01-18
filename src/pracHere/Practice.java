package pracHere;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Practice {
 public static void main(String args[]) {
	 
	 //arrays practice
	/*int [] ar = {1,3,6,1,8,10,9};
	Arrays.sort(ar);
	System.out.println(Arrays.toString(ar));
	System.out.println(Arrays.binarySearch(ar, 10));
	int[] copyOf = Arrays.copyOf(ar, ar.length-1);
	System.out.println(Arrays.toString(copyOf));
	boolean equals = Arrays.equals(ar, copyOf);
	System.out.println(equals);
	*/
	 //String practice
	/* String st[] = {"arvind","shivam","pooja"};
	 String str1 = "Aman";
	 String str2 = "shubham kumar";
	 System.out.println(str1.length() < str2.length());
	 System.out.println(str2.charAt(7));
	 int indexOf = str2.indexOf("k");
	 System.out.println(indexOf);
	 System.out.println(str2.substring(0, 7));
	 System.out.println(str1.concat(" ").concat(str2));
	 System.out.println(str2.replace("shubham", "singh"));*/
	 //contains split replace trim
//	 Map<String,Integer> mp = new HashMap<>();
//	 mp.put("Shubham", 1);
//	 mp.put("abhishek", 5);
//	 mp.put("kiran", 9);
//	 
//	 for(String st :mp.keySet()) {
//		 System.out.print(st+" ");
//	 }
//	 
//	 for(Integer k : mp.values()) {
//		 System.out.println(k);
//	 }
//	 for(Map.Entry<String,Integer> kp : mp.entrySet()) {
//		 System.out.println(kp.getKey()+" "+kp.getValue());
//	 }
	 
	 int[] ar = {1,4,6,2,7};
	 int maxpr = 0;
	 int minpr = ar[0];
//	 List<Integer> kd = new ArrayList<>();
//	 for(int i= 0;i<ar.length;i++) {
//		 for(int j=i+1;j<ar.length;j++) {
//			 if(ar[i] < ar[j]) {
//				 maxpr = ar[j] - ar[i];
//				 kd.add(maxpr);
//			 }
//		 }
//	 }
////	 Collections.sort(kd);
////	 System.out.println(kd.get(kd.size()-1));
//	 System.out.println(kd.stream().max(Comparator.naturalOrder()));
//	 for(int i = 1;i<ar.length;i++) {
//		 if(minpr > ar[i]) {
//			 minpr = ar[i];  //updating min
//		 }
//		 else {
//			 int currPr = ar[i] - minpr;
//			 if(currPr > maxpr) {
//				 maxpr = currPr; 
//			 }
//		 }
//	 }
//	 System.out.println(maxpr);
//	 System.out.println(minpr);
	 
//	 List<Employee> emp = Arrays.asList(
//		new Employee(1,"Madhu",23,"Female"),	 
//		new Employee(2,"Abhishek",12,"Male"),
//		new Employee(3,"Rohini",35,"Female"),
//		new Employee(4,"Priya",20,"Female"),
//		new Employee(6,"Shiv",23,"Male")
//			 );
//	 Map<String, Long> collect = emp.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));
//	 System.out.println(collect);
	 
	 List<Integer> dg = Arrays.asList(1,3,2,4,45,4,4,3,45,3,7,4,3,3);
//	 List<Integer> collect2 = dg.stream().distinct().collect(Collectors.toList());
//	 System.out.println(collect2);
	 
//	  List<Integer> collect = dg.stream().collect(Collectors.groupingBy(d->d,Collectors.counting())).entrySet()
//			 .stream().filter(k->k.getValue()>1).map(Map.Entry::getKey).collect(Collectors.toList());
	 Set<Integer> collect = dg.stream().filter(c->Collections.frequency(dg, c)> 1).collect(Collectors.toSet());
	  
	 System.out.println(collect); 
	 
	 
 }

}
