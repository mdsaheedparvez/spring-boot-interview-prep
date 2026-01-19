package arrayssRelated;

import java.util.Arrays;

public class Merge {

	public static void main(String[] args) {

		int a1[] = new int[6]; // enough space
		a1[0] = 1;
		a1[1] = 2;
		a1[2] = 5;

		int m = 3;

		int a2[] = { 5, 6, 8 };
		int n = 3;

		int i = m;

		for (int j = 0; j < n; j++) {
			a1[i] = a2[j];
			i++;
		}

		Arrays.sort(a1);

		System.out.println(Arrays.toString(a1));
	}
}
