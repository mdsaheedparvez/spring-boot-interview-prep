package Java8Features;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java8feat {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 34, 5, 5, 5,56,89,98,67,45,44,56);
		List<Integer> collect = list.stream().
		filter(x->x%2==0)
		.map(x->x/3)
		.sorted((a,b)->b-a)
		.limit(4)
		.skip(1)
		.collect(Collectors.toList());
//		System.out.println(collect);
		Integer collect2 = Stream.iterate(50, x->x+1)
				.limit(100)
				.filter(x->x%2==0)
				.map(x->x/5)
				.sorted()
				.distinct()
				.skip(2)
				.peek(System.out::println)
				.max((a,b)->a-b).get();
		System.out.println(collect2);
		
//		Stream.generate()
//		Stream.of(null)
				
	}
	
}
