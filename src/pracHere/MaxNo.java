package pracHere;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class MaxNo {

	public static void main(String[] args) {

		
//		Integer[] arr = {23,3,5,7,8,5,98,9};
//		List<Integer> df = new ArrayList<>();
////		for(int d :arr) {
////			df.add(d);
////		}
//		List<Integer> asList = Arrays.asList(arr);
////		System.out.println(df);
//		/* Optional<Integer> max = asList.stream().max(Comparator.naturalOrder()); */
////		Integer max = asList.stream().max(Comparator.comparing(Integer::valueOf)).get();
//		Optional<Integer> max = asList.stream().reduce(Integer::max);
//		System.out.println(max);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of Rows:");
		Integer rows = sc.nextInt();
		
		for(int i=1;i <= rows; i++) {
			
			for(int j=rows;j>=i;j--) {
				
				System.out.print(j+"*");
			}
			System.out.println();
			
		}
		sc.close();
		
		
		
		
		
	}

}
