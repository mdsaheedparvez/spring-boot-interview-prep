package Interview;

import java.util.LinkedList;

//You are climbing a staircase. It takes n steps to reach the top.
//Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
//  5  1 2 2  2 1 2  2 2 1 
public class Linkkk {

	public static void main(String[] args) {
		  int n = 6;
            Linkkk ln = new Linkkk();
            System.out.println(ln.getWays(n));
	}

	public int getWays(int n) {
        int prev = 1;
        int prev1 = 1;
		for(int i = 2;i<=n;i++) {
			int cur = prev + prev1;
			prev1 = prev;
			prev = cur;
		}
		return prev;
	}

}
