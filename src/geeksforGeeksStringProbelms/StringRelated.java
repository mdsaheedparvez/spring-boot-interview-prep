package geeksforGeeksStringProbelms;

public class StringRelated {
	private String getlogestPrefix(String[] arr) {
		String result = arr[0];
		int n = arr.length;
		for(int i=1;i<n;i++) {
			while(arr[i].indexOf(result) != 0) {
				result = result.substring(0, result.length()-1);
				  if(result.isEmpty()){
	                    return "-1";
	                }
			 }
		}
		return result;
		
	}

	public static void main(String[] args) {
		StringRelated st = new StringRelated();
		String[] sh = {"Abhisek","Abhiram","Abhikiran"};
		System.out.println(st.getlogestPrefix(sh));
	}

}
