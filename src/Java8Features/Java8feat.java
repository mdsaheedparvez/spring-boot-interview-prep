package Java8Features;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java8feat {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 34, 5, 5, 5,56,89,98,67,45,44,56);
		List<Integer> collect = list.stream().
		filter(x->x%2==0)    // 2,34,56,98,44,56
		.map(x->x/3)          //2/3,14,18,32,14,18
		.sorted((a,b)->b-a)  //32,18,18,14,14,2/3
		.limit(4)            //32,18,18,14
		.skip(1)             //18,18,14
		.collect(Collectors.toList());
		System.out.println(collect);
		System.out.println("---------------------------1 line----------------");
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
		System.out.println("----------------------2 line---------------------");
		
		List<Integer> list2 = Arrays.asList(1, 2, 34, 5, 5, 5,56,89,98,67,45,44,56,26);
		List<Integer> collect3 = list2.stream().
		filter(y->y%2==0).    //2,34,56,98,44,56,26
		map(i->i/2).          //1,17,28,49,22,28,13
		distinct().           //1,17,28,49,22,13
		sorted((a,b)->b-a)    //49,28,22,17,13,1
		.peek(System.out::println).
		limit(3).              // 49,28,22
		skip(1).               //28,22
		collect(Collectors.toList());
		
		System.out.println(collect3);
				
	}
	
}
