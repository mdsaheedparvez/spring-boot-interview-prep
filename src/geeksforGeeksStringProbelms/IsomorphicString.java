package geeksforGeeksStringProbelms;

import java.util.Scanner;

public class IsomorphicString {

	public static void main(String[] args) {

		IsomorphicString isomorphicString = new IsomorphicString();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first String: ");
		String s1 = sc.next();
		System.out.println("Enter the first String: ");
		String s2 = sc.next();
		if(s1.length() == s2.length()) {
			isomorphicString.checkIsomorphic(s1,s2);
		}
		else 
			System.out.println("Not equal the length of the input"+s1+"and"+s2+" is not same ");
		
	}

	private boolean checkIsomorphic(String s1, String s2) {
		return false;
	}

}
