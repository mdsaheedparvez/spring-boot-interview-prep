package Interview;

import java.util.*;

public class Intervieww {

	public static void main(String[] args) {
//		 String s = "aman";
//		   String t = "namak";
//		    
//		   char[] sr =  s.toCharArray();
//		   char sr1 [] =  t.toCharArray();
//		   
//		    Arrays.sort(sr);  
//		    Arrays.sort(sr1);
//		    
//		    if(Arrays.equals(sr,sr1)){
//		       System.out.println("true");
//		    }
//		    else 
//		     System.out.println("false");
		
		 	int nums[] = {1,34,3,3,4,4,34};
	        int sddd = 0;
	        List<Integer> sd = new ArrayList<>();
	        for(int s : nums){
	            sd.add(s);
	        }
	      // System.out.println(sd);
	        
//	        for(int i = 0 ;i<sd.size();i++){
//	            if(sd.get(i).)
//	               sddd = sd.get(i);
//	        }
	        
	        int ad[] = {1,2,3,4,5,6,7,8,9,10}; 
	        int temp[] = new int[ad.length];
	        int index = 0;
	        for(int  i =0 ;i<ad.length;i++){
	            if(i == 0 || i%2 ==0){
	            	temp[index] = ad[i+1];
	                index++;
	            }
	            else{
	            	temp[index] = ad[i-1];
	                index++;
	            }
	        }
	        
	        System.out.println(Arrays.toString(temp));
	}

}
