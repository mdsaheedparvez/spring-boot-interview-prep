package pracHere;

public class RepeatWord {

	public static void main(String[] args) {

		String[] str = { "flower", "flow", "flight" };
		String result = str[0];

		for (int i = 1; i < str.length; i++) {
			while (str[i].indexOf(result) != 0) {
				result = result.substring(0, result.length() - 1);
			}
		
		}
		System.out.println(result);

	}

}
