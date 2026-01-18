package pracHere;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@SuppressWarnings(value = {  "rawtypes", "unchecked" })
public class Abcc {

	public static void main(String[] args) {
		//Swapping
//		System.out.println("Enter the First Value X :");
//		Scanner sc = new Scanner(System.in);
//		Integer x = sc.nextInt();
//		System.out.println("Enter the First Value Y :");
//		Scanner kn = new Scanner(System.in);
//		Integer y = kn.nextInt();
//		x=x+y;
//		y=x-y;
//		x=x-y;
//		System.out.println("After Swapping x:"+x+" After Swapping y:"+y);
		
		Integer ar[] = {2,45,4,67,0,3,58,0,58,4};
		
		 List<Integer> collect = Stream.of(ar).distinct().collect(Collectors.toList());
		 System.out.println(collect);
		
//		List<Integer> sd = new ArrayList<Integer>();
//		for(int i :ar) {
//			sd.add(i);
//		}
//		Collections.sort(sd);
//		List ff = sd.stream().distinct().collect(Collectors.toList());
//		System.out.println(ff);
		
		
		//Convert ArrayList to String array
//		List<String> gk = new ArrayList<String>();
//		gk.add("Aman");
//		gk.add("Kiran");
//		gk.add("Puran");
//		gk.add("Ramesh");
//		gk.add("Pinky");
//		Collections.sort(gk);
//		
//		String[] rr = gk.toArray(new String[gk.size()]);
		
//		for(int i=0;i<gk.size();i++) {
//			rr[i]=gk.get(i);
//		}
//		for(String ff : rr) {
//			System.out.print(ff+" ");
//		}
		
		Set<String> hf = new HashSet<String>();
		hf.add("Aman");
		hf.add("Kiran");
		hf.add("Kiran");
		hf.add("Puran");
		hf.add("Ramesh");
		hf.add("Pinky");
		hf.add("Abishek");
		
//		Iterator itr = hf.iterator();
//		while(itr.hasNext()) {
//			System.out.print(itr.next()+" ");
//		}
		if(hf.contains("Abishek")) {
			System.out.println("Present");
		}
		else {
			System.out.println("Not Present");
		}

	}

}
