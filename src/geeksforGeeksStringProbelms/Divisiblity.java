package geeksforGeeksStringProbelms;

import java.util.Scanner;

public class Divisiblity {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		Divisiblity dv = new Divisiblity();
		System.out.println(dv.checkDivis(num));
		
	}

	private String checkDivis(int num) {
		if(num % 7 == 0) {
			return "Divisible by 7";
		}
		else
			return "Not divisible by 7";
			
	}

}
