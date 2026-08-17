package leetCode.StringRelatedLeetcodeOld;

import java.util.Scanner;

public class LastWordcount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the word to count:");
		String cntLast = sc.nextLine();
		System.out.println(countLast(cntLast));
		sc.close();
	}

	private static int countLast(String s) {
		s.trim();
		String b = s.substring(s.lastIndexOf(' ') + 1); // dgrrdb
		return b.length();
	}

}
