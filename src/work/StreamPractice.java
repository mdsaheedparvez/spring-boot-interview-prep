package work;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamPractice {

	public static void main(String[] args) {
		
		List<Integer> list = List.of(12,4,7,3,9,17,24);

		List<Integer> list2 = new ArrayList<Integer>();
		list2.add(4);
		list2.add(13);
		list2.add(3);
		list2.add(7);
		list2.add(46);
		
		List<Integer> list3 = Arrays.asList(2,4,6,5,9,7,13);
		
		List<Integer> even = new ArrayList<>();
		
		//without Api
//		for(Integer g : list) {
//			if(g % 2 == 0) {
//				even.add(g);
//			}
//		}
//		System.out.println(list);
//		System.out.println(even);
		
		//with stream Api
//		System.out.println(list2);
//		list2.removeIf(x->x % 2 != 0);
//		
//		System.out.println(list2);
		
		System.out.println(list);
//		Stream<Integer> stream = list.stream();
		List<Integer> collect = list.stream().filter(x->x % 2 == 0).collect(Collectors.toList());
        System.out.println(collect);
		
		
		
	}

}
