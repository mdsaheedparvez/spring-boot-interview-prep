package Java8Features;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Practicejava8Questions {

	public static void main(String[] args) {

          List<EmployeeePrac> emplList = Arrays.asList(new EmployeeePrac("Shivam", "92393745984769", 21, 123.23,"HR"),
        		  new EmployeeePrac("Kiran", "92393745984769", 24, 90.23,"Developer"),
        		  new EmployeeePrac("Abhishek", "92393745984769", 31, 877.23, "Painter"),
        		  new EmployeeePrac("Aman", "92393745984769", 35, 23994.23,"EngineeringSales"));
          
          //max paid salary
          Optional<EmployeeePrac> max = emplList.stream().max(Comparator.comparing(EmployeeePrac::getSalary));
          System.out.println(max.get());
          
          //employee starts with s
         System.out.println(emplList.stream().filter(x->x.getEmpName().startsWith("S")).toList());  
          
         //employee grouping by department
          Map<String, List<EmployeeePrac>> groupingDep = emplList.stream().collect(Collectors.groupingBy(EmployeeePrac::getDepartment));
          System.out.println(groupingDep);
          
          //print all employees names
          System.out.println(emplList.stream().map(EmployeeePrac::getEmpName).toList());
          
          //count employee in each department
          System.out.println(emplList.stream().collect(Collectors.groupingBy(EmployeeePrac::getDepartment, Collectors.counting())));
          
          //employees salary greater 5000
          System.out.println(emplList.stream().filter(x->x.getSalary()> 5000).collect(Collectors.toList()));
          
          //employee name only whose salary greater than 10000
          System.out.println(emplList.stream().filter(x->x.getSalary() > 10000).map(EmployeeePrac::getEmpName).toList());
          
          //average salary
          System.out.println(emplList.stream().mapToDouble(EmployeeePrac::getSalary).average().orElse(0));
          
          //sort employee salary descending oder
          System.out.println(emplList.stream().sorted(Comparator.comparing(EmployeeePrac::getSalary).reversed()).toList());
          
          //youngest employee
          System.out.println(emplList.stream().min(Comparator.comparing(EmployeeePrac::getAge)));
          
          //group employees by department and collect names
          System.out.println(emplList.stream().collect(Collectors.groupingBy(EmployeeePrac::getDepartment,
        		  Collectors.mapping(EmployeeePrac::getEmpName, Collectors.toList()))));
          
          //second highest salary of employee
          System.out.println(emplList.stream().sorted(Comparator.comparing
        		  (EmployeeePrac::getSalary).reversed()).skip(1).findFirst().get());
          
          
          //sum of all the number
          List<Integer> numList =  Arrays.asList(1,4,5,7,4,9,3);
          System.out.println(numList.stream().mapToInt(x->x).sum());
          System.out.println(numList.stream().reduce(0, (x,y)->x+y));
          System.out.println(numList.stream().reduce(Integer::sum).get());
          
          
          
          
          
          
          
	}

}
