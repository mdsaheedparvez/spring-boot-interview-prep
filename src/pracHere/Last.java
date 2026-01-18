package pracHere;
import java.util.Scanner;

public class Last {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the word:");
//		String rm = sc.next();
		String rm = "the world is here";
//		String trim = rm.trim();
		String substring = rm.substring(rm.lastIndexOf(' ')+1);
		System.out.println(substring.length());
		
	}

}
