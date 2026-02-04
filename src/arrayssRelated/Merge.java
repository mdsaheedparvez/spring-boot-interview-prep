package arrayssRelated;

import java.util.Arrays;

public class Merge {

	public static void main(String[] args) {

		int A[] = new int[6];
		A[0] = 2;
		A[1] = 3;
		A[2] = 4;

		int B[] = { 5, 6, 8 };

		int m = 3;
		for (int i = 0; i < B.length; i++) {
			A[m++] = B[i];
		}
		Arrays.sort(A);
		System.out.println(Arrays.toString(A));
	}
}
