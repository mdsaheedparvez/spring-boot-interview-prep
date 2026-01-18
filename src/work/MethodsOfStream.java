package work;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MethodsOfStream {

	public static void main(String[] args) {
		
		//filter (Predicate)  -> return boolean value
		
		//map(function) - > each element
		
		List<String> str = List.of("Aman", "nurun", "shivam", "shikha" );
		List<String> collect = str.stream().filter(x->x.startsWith("s")).collect(Collectors.toList());
		System.out.println(str);
		System.out.println(collect);
	
		//map to perform operations
		List<Integer> listNum = List.of(23,56,67,3);
		List<Integer> collect2 = listNum.stream().map(x->x*x).collect(Collectors.toList());
		System.out.println(collect2);
		
		listNum.stream().forEach(x->{
			System.out.print(x*x +" ");
		});

		//using method method refence
		collect.stream().forEach(System.out::println);
		
		
		//sorted
		collect2.stream().sorted().forEach(System.out::println);
		
		//max && min
		Integer integer = listNum.stream().max((x,y)->x.compareTo(y)).get();
		System.out.println(integer);
		
		Integer integer2 = listNum.stream().min((x,y)->x.compareTo(y)).get();
		System.out.println(integer2);
		
	}

}
