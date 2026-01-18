package work;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamObject {


	public static void main(String[] args) {
		
		//1 st way
		Stream<Object> empty = Stream.empty();
     
		//2nd way
		String[] gfg =  {"saddy ", "nurun ", "fgg ", "abhishek"};
		Stream<String> newst = Stream.of(gfg);
		newst.forEach(x->{
			System.out.print(x);
		});
		
		//3rd way
		Stream<Object> build = Stream.builder().build();
		
		//4th way
	   IntStream stream = Arrays.stream(new int[]{1,3,5,7});
	   stream.forEach(x->{
		   System.out.println(x);
	   });
	   
	   //5th way if it is arrays,list
	   List<Integer> list2 = new ArrayList<Integer>();
		list2.add(4);
		list2.add(13);
		list2.add(3);
		list2.add(7);
		list2.add(46);
		list2.stream().forEach(x->{
			System.out.println(x);
		});
		
	}

}
