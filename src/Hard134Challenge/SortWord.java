package Hard134Challenge;

import java.util.Arrays;

public class SortWord {

	public static void main(String[] args) {
		String fg = "Superman";
		char[] charArray = fg.toLowerCase().toCharArray();
		Arrays.sort(charArray);
		System.out.println(charArray);
	}

}
