package pract;

import java.util.Scanner;

public class RemoveSpecial {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the character with the special character");
		String next = sc.next();
		
//		String newString = next.replaceAll("[^a-zA-Z0-9]", "");
//		System.out.println(newString);
		
//		StringBuilder st = new StringBuilder(next);
//		System.out.println(st.reverse());
		
		for(int i=next.length() -1; i>=0;i--) {
			System.out.print(next.charAt(i));
		}
		
		
	}

}
