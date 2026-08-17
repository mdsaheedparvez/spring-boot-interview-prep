package pracHere;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class DoPractice {
	
	public static void main(String[] args) {
		
//		combine predicate,consumer,funtion, supplier
		
		Predicate<Integer> predicate  = a -> a % 2 == 0 ;  // boolean valued function checks the condition
//		System.out.println(predicate.test(22));
		
		Function<Integer, Integer> function = b -> 2+b;    // work for takes some input and return something
//		System.out.println(function.apply(65));
		
		Consumer<Integer> consumer = x -> System.out.println(x);  //takes something doesnot retun 
//		consumer.accept(56);
		
		Supplier<Integer> supplier = () -> 200;    // didnt take anything but return something
//		supplier.get();
		
		if(predicate.test(supplier.get())) {
			consumer.accept(function.apply(supplier.get()));
		}
		
		
//		List<Integer> asList = Arrays.asList(1,2,34,34,54);
		Stream.generate(() -> 1).limit(2).forEach(System.out::println);
		Stream.iterate(2, x->x*2).limit(5).forEach(System.out::print);
		
		String sent  = "boolean valued function checks the condition";
		System.out.println(sent.chars().filter(x->x == 'f').count());
		
		
	}

}
