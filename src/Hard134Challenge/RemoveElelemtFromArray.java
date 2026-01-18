package Hard134Challenge;

import java.util.Arrays;

public class RemoveElelemtFromArray {

	public static void main(String[] args) {
		int [] df = {1,3,5,2,6,8}; int remo = 6;
		int[] removeElement = RemoveElelemtFromArray.removeElement(df,remo);
		System.out.println(Arrays.toString(df));
		System.out.println(Arrays.toString(removeElement));
									
	}

	private static int[] removeElement( int[] df,int remo) {
		int [] gh = new int[df.length -1];
		int index = 0;
		for(int i = 0; i<df.length;i++) {
			if(df[i] != remo) {
				gh[index] = df[i];
				index ++;
			}
		}
		return gh;
		
	}

}
