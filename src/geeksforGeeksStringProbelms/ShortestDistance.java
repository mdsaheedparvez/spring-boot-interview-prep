package geeksforGeeksStringProbelms;

import java.util.stream.IntStream;

public class ShortestDistance {

	public static void main(String[] args) {
		ShortestDistance shortestDistance = new ShortestDistance();
		String[] ftt = { "Im", "at", "the", "third", "position" };
		String f1 = "at";
		String f2 = "the";

		System.out.println(shortestDistance.calculatedis(ftt, f1, f2));
	}

//	private int calculatedis(String[] ftt, String f1, String f2) {
//
//		int index1 = -1;
//		int index2 = -1;
//		int minDistance = Integer.MAX_VALUE;
//
//		for (int i = 0; i < ftt.length; i++) {
//
//			if (ftt[i].equals(f1))
//				index1 = i;
//
//			if (ftt[i].equals(f2))
//				index2 = i;
//
//			if (index1 != -1 && index2 != -1)
//				minDistance = Math.min(minDistance, Math.abs(index1 - index2));
//		}
//
//		return minDistance;
//	}

	// java 8
	private int calculatedis(String[] ftt, String f1, String f2) {

		int i1 = IntStream.range(0, ftt.length).filter(x -> ftt[x].equals(f1)).findFirst().orElse(-1);

		int i2 = IntStream.range(0, ftt.length).filter(i -> ftt[i].equals(f2)).findFirst().orElse(-1);

		return Math.abs(i1 - i2);
	}

}
