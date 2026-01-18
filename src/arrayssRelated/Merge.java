package arrayssRelated;

import java.util.Arrays;

public class Merge {

	public static void main(String[] args) {

		int a1[] = {1,2,5,7,6};  int m=3;
		int a2[] = {5,6,8};      int n= 3;
		int i,j = 0;
		
		for( j=0, i=m; j<n; j++) {
			a1[i] = a2[j];
			i++;
		}
		Arrays.sort(a1);
		System.out.println(a1);
		
	}

}
