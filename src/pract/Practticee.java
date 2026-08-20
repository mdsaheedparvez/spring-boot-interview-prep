package pract;

public class Practticee {

	public static void main(String[] args) {
		int arrDt[] = { 1, 3, 11, 5, 6, 7, 9 };
		// int ans = 7;
		int secondMax = Practticee.secondMax(arrDt);
		System.out.println(secondMax);

	}

	private static int secondMax(int[] arrDt) {
		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;

		for (int num : arrDt) {
			System.out.println("num : " + num);
			if (num > largest) {
				secondLargest = largest;
				largest = num;
				System.out.println("secondLargest : " + secondLargest);
				System.out.println("largest : " + largest);
			} else if (num > secondLargest && num != largest) {
				secondLargest = num;
				System.out.println("secondLargest : " + secondLargest);
				System.out.println("largest : " + largest);
			}
		}
		return secondLargest;
	}

}
