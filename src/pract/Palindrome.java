package pract;

public class Palindrome {
  public static void main(String[] args) {
//	  String str = "Parvez";
//		for(int i=str.length()-1;i>=0;i--) {
//			System.out.print(str.charAt(i));
//		}
	  
	  String str = "MADAM";
	  int count =0;
	  int j = str.length()-1;
	  for(int i=0;i<str.length();i++) {
		  if(str.charAt(i) == str.charAt(j--)) {
			  count++;
		  }
	  }
	  if(count == str.length()) {
		System.out.println("Palindrome");  
	  }
	  else System.out.println("Not Palindrome");
}
	
}
