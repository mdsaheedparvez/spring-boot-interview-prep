package geeksforGeeksStringProbelms;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CountString {

	public static void main(String[] args) {

		int whtSpc = 0;
		int uppCs = 0;
		int lwcs = 0;
		int spc = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the word/sentance:");
		String next = sc.nextLine();
		sc.close();
//		for (int i = 0; i < next.length(); i++) {
//
//			if (Character.isWhitespace(next.charAt(i)))
//				whtSpc++;
//
//			if (Character.isLowerCase(next.charAt(i)))
//				lwcs++;
//
//			if (Character.isUpperCase(next.charAt(i)))
//				uppCs++;
//		}
//
//		System.out.println("White Space: " + whtSpc +
//				" Upper Case: " + uppCs +
//				" Lower Case: " + lwcs);
//
//		CountString countString = new CountString();
//		int countSpr = countString.countSpr(next);
//		System.out.println(countSpr);
		
		//java 8
		long isWhitespace = next.chars().filter(Character::isWhitespace).count();
		long isUpperCase = next.chars().filter(Character::isUpperCase).count();
		long isLowerCase = next.chars().filter(Character::isLowerCase).count();
		long isNotLetterOrDigit = next.chars().filter(ch -> !Character.isLetterOrDigit(ch) && !Character.isWhitespace(ch)).count();
		System.out.println("isWhitespace "+ isWhitespace);
		System.out.println("isUpperCase "+ isUpperCase);
		System.out.println("isLowerCase "+ isLowerCase);
		System.out.println("Special character "+isNotLetterOrDigit );

	}

	// It will count space as well if it is sentance
	private int countSpr(String next) {
		int count = 0;
		Pattern pattern = Pattern.compile("[^a-zA-Z0-9]");
		Matcher matcher = pattern.matcher(next);
		while (matcher.find()) {
			count++;
		}
		return count;
	}

}
