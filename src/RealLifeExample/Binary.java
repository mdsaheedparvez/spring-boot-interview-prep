package RealLifeExample;

import java.util.ArrayList;
import java.util.List;

public class Binary {

	public static void main(String[] args) {

//		String x = "011011";  String y = "1010111";
//		int x1 = Integer.parseInt(x,2);
//		int x2 = Integer.parseInt(y,2);
//		
//		int sum = x1 + x2;
//		String binaryString = Integer.toBinaryString(sum);
//		System.out.println(binaryString);
		
		int x= 10; int y =23;int z = 234;
		
		List<Integer> li = new ArrayList<>();
		li.add(x);li.add(y);
		li.add(z);
		Integer integer = li.stream().max((a,b)->a.compareTo(b)).get();
		System.out.println(integer);
		
	}

}
