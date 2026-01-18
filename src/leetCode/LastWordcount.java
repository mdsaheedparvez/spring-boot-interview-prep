package leetCode;

import java.util.Scanner;

public class LastWordcount {

	public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the word to count:");
      String cntLast = sc.nextLine();
		LastWordcount lstd = new LastWordcount();
		System.out.println(lstd.countLast(cntLast));
	}

	private int countLast(String s) {
		int ln = 0;
        String b = s.substring(s.lastIndexOf(' ')+1);
        if(b ==" "){
            String k = s.substring(s.lastIndexOf(' ')-1);
            ln =k.length();
        }
        else 
             ln = b.length();
        return ln;
    }
	

}
