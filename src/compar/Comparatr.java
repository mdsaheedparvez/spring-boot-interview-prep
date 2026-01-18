package compar;

import java.util.*;

public class Comparatr {

	public static void main(String[] args) {
      
//		List<Integer> arli = new ArrayList<>();
//		arli.add(91);
//		arli.add(12);
//		arli.add(56);
//		arli.add(76);
//		System.out.println(arli);
//		Collections.sort(arli);
//		System.out.println(arli);
		
		List<Employee> arli = new ArrayList<>();
		arli.add(new Employee("shivam","345353535",45));
		arli.add(new Employee("kiran","345353535",24));
		arli.add(new Employee("phuu","3453545654",35));
		
//		System.out.println(arli);
		
		//using Comparable
//		Collections.sort(arli);
//		System.out.println(arli);
		
		//using comparator
		Collections.sort(arli, new IdComparator());
		System.out.println(arli);
		
		List<Employee> arli1 = new ArrayList<>(arli);
		Collections.sort(arli1, new NameComparator());
		System.out.println(arli1);
		
	}

}
