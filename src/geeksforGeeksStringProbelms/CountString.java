package geeksforGeeksStringProbelms;

import java.util.Scanner;
import java.util.regex.Matcher;

public class CountString {

	public static void main(String[] args) {
        
		int whtSpc = 0; int uppCs = 0;int lwcs = 0; int spc =0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the word:");
		String next = sc.nextLine();
//		for(int i = 0; i<next.length();i++) {
//			
//			if(Character.isWhitespace(next.charAt(i)))
//				whtSpc++;
//			
//			if(Character.isLowerCase(next.charAt(i)))
//				lwcs++;
//			
//			if(Character.isUpperCase(next.charAt(i)))
//				uppCs++;
//		}
		
		System.out.println("White Space: "+whtSpc+ " Upper Case: "+uppCs+ " Lower Case: "+ lwcs);
		
		CountString countString = new CountString();
		int countSpr = countString.countSpr(next);
		System.out.println(countSpr);
		
	}

	private int countSpr(String next) {
		int count = 0;
		java.util.regex.Pattern pattern = java.util.regex.Pattern.compile("[^a-zA-Z0-9]");
		Matcher matcher = pattern.matcher(next);
		while (matcher.find()) {
			count++;
		}
		return count;
	}

}
