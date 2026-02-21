package geeksforGeeksStringProbelms;

import java.util.Scanner;

public class ClosingStr {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(countCht(sc.nextLine()));

	}

	public static int countCht(String str) {
//		int rsult = 0;
//		for (int i = 0; i < str.length(); i++) {
//			if (str.charAt(i) == 'K') {
//				rsult++;
//			}
//		}
//
//		return rsult;

//		java 8
         if(str.isEmpty()) {return 0;}
         
		return (int) str.chars().filter(x -> x == 'K' || x == 'k').count();

	}

}
