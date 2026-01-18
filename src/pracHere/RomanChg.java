package pracHere;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RomanChg {

	public static void main(String[] args) {
      
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Roman Number:");
		String rm = sc.next();
		
		Map<Character,Integer> mp = new HashMap<>();
		mp.put('I', 1);
		mp.put('V', 5);
		mp.put('X', 10);
		mp.put('L', 50);
		mp.put('C', 100);
		mp.put('D', 500);
		mp.put('M', 1000);
		int ans = 0;
		
		for(int i = 0; i < rm.length(); i++) {
			if(i < rm.length() - 1 && mp.get(rm.charAt(i)) < mp.get(rm.charAt(i+1))) {
				ans -= mp.get(rm.charAt(i));
			}
			else
				ans += mp.get(rm.charAt(i));
			
		}
		
		System.out.println(ans);
		
		
	}

}
