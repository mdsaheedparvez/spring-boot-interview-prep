package pracHere;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BuySell {

	public static void main(String[] args) {

	  int[] arr = {1,3,2,5,7}; 
      int maxproft = 0;
      
      List<Integer> sb = new ArrayList<>();
      
      for(int i = 0 ; i<arr.length ; i++) {
    	 for(int j = i+1; j<arr.length; j++) {
    		  if(arr[i] < arr[j]) {
    			  maxproft = arr[j] - arr[i]; 
    			  sb.add(maxproft);
    		  }
    	  }
      }
      
      Collections.sort(sb);
      System.out.println(sb.get(sb.size()-1));
      
      
//      System.out.println(sb.stream().max(Comparator.naturalOrder()));
//      System.out.println(sb.stream().reduce(Integer::max));
//      System.out.println(sb.stream().max(Comparator.comparing(Integer::valueOf)).get());

	}

}
