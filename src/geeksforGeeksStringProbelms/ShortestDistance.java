package geeksforGeeksStringProbelms;

public class ShortestDistance {

	public static void main(String[] args) {
		ShortestDistance shortestDistance = new ShortestDistance();
		String[] ftt = {"Im", "at", "the", "third", "position"};
		String f1 ="at";
		String f2 ="third";
		
		System.out.println(shortestDistance.calculatedis(ftt,f1,f2));
	}

	private int calculatedis(String[] ftt,String f1, String f2) {
		int d1 = 0;int d2= 0; int dist = 0;
		for(int i= 0;i<ftt.length;i++) {
			if(ftt[i] == f1) {
				d1 =i;
			}
			if(ftt[i] == f2) {
				d2 =i;
			}
		}
		dist = d2 - d1;
		return dist;
	}

	

}
