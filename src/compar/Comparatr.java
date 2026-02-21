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
		arli.add(new Employee("pinky","345353535",45,500.67D));
		arli.add(new Employee("bunty","345353535",24,200.67D));
		arli.add(new Employee("Abhishek","3453545654",35,300.67D));
		
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
		
//		List<Employee> arli2 = new ArrayList<>(arli);
//		Collections.sort(arli2,new SalaryCompar());
//		System.out.println(arli2);
		
		arli.sort(Comparator.comparing(Employee::getSalary));
		System.out.println(arli);
	}

}
