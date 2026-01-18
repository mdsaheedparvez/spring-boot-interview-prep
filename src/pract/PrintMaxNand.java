package pract;

public class PrintMaxNand {

	public static void main(String[] args) {
       int ad [] = {1,23,24,56,8};
//       int min =Integer.MAX_VALUE;int max =Integer.MIN_VALUE;
//       for(int sg : ad) {
//    	   min = Math.min(min, sg);
//    	   max = Math.max(max, max)
//       }
       int min =1; int max =0;
       for(int i =0;i<ad.length;i++) {
    	   for(int j =i+1;j<ad.length;j++) {
    		   if(ad[i] > ad[j]) {
    			  if(max < ad[i])
    			      max = ad[i];
    			  else 
    				  max = max;
    		   }
    		   
    		   if(ad[i] < ad[j]) {
     			  if(min < ad[i])
     			      min = min;
     			  else 
     				  min = ad[i];
     		   }
    		  
    	   }
       }
       System.out.println(max);
       System.out.println(min);
	}

}
