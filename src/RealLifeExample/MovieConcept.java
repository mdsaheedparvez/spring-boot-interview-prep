package RealLifeExample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MovieConcept {

	public static void main(String[] args) {
		
		List<Movie> movie = new ArrayList<>();
		movie.add(new Movie("Narnia",6));
		movie.add(new Movie("Harry Potter",8));
		movie.add(new Movie("Animal",3));
		movie.add(new Movie("Dumbledor",3));
		movie.add(new Movie("See",10));
		
		Map<Integer, List<Movie>> collect = movie.stream().collect(Collectors.groupingBy(x->x.getRatings(),Collectors.toList()));
        System.out.println(collect);
	}

}
