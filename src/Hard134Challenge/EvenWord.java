package Hard134Challenge;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EvenWord {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the word here: ");
		String str = sc.nextLine();
		List<String> countEven = EvenWord.countEven(str);
		System.out.println(countEven);
	}

	private static List<String> countEven(String str) {
//		String[] split = str.split(" ");
		List<String> fg = new ArrayList<>();
		for(String sr : str.split(" ")) {
			if(sr.length() % 2 ==0) {
				fg.add(sr);
			}
		}
		return fg;
	}

}
