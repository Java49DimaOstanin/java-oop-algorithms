package telran.algorithm;

public class InitialAlgorithms {
	  public static void sortShortPositive(short[]array) {
		  int[] helper = new int[Short.MAX_VALUE];
		  for(int i = 0;i < array.length;i++) {
			  helper[array[i]]++;
		  }
		  int ind = 0;
		  for(int i = 0; i< helper.length;i++) {
			  for(int j = 0;j < helper[i];j++) {
				  array[ind++] = (short) i ;
			  }
		  }
	  }
	  public static boolean isSum2(short[]array,short sum) {
		  bubbleSort(array);
		  boolean flag= false;
		  int  l = 0;
		  int  r = array.length-1; 
		    while(l < r)
		    {
		         if(array[l] + array[r] == sum) {
		              flag = true;
		              l = r;
		         }
		         else if(array[l] + array[r] < sum)
		              l++;
		         else 
		              r--;
		    }
		  
		  return flag;
	  }
	  public static void bubbleSort(short [] sort_arr){
	        
	        for (int i=0;i<sort_arr.length-1;++i){
	            for(int j=0;j<sort_arr.length-i-1; j++){
	                if(sort_arr[j+1]<sort_arr[j]){

	                    short swap = sort_arr[j];
	                    sort_arr[j] = sort_arr[j+1];
	                    sort_arr[j+1] =  swap;

	                }
	            }
	        }
	    }
	  public static short getMaxPositiveWithNegativeReflect(short[]array) {
		  bubbleSort(array);
		  short result = -1;
		  int  l = 0;
		  int  r = array.length-1; 
		    while(l < r )
		    {
		         if(Math.abs(array[l]) == array[r]) {
		             result = array[r];
		              r = l;
		         }
		         else if(Math.abs(array[l]) < array[r] )
		        	 r--; 
		        	 
		         else 
		        	 l++;
		    }
		  	  
		  
		  return result;
	  }
}

