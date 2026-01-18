package geeksforGeeksStringProbelms;

import java.util.Scanner;

public class ClosingStr {

	public static void main(String[] args) {
     
		Scanner sc = new Scanner(System.in);
		String nextStr = sc.next();
		ClosingStr closingStr = new ClosingStr();
		System.out.println(closingStr.counClse(nextStr));
	}

	private int counClse(String str) {
		
		int count=0;
		for(int i = 0; i<str.length();i++){
          if(str.charAt(i) == ')') {
        	  count++;
          }
		}
		return count;
	}

}
