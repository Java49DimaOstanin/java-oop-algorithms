package telran.algorithm.recursion;

public class LineRecursion {
 public static long factorial(int n) {
	 if(n < 0) {
		 throw new IllegalArgumentException("Cannot be negative");
	 }
	 long res = 1;
	 if(n > 1) {
		 res = n * factorial(n-1);
	 }
	 return res;
 	}
 public static long pow(int a ,int b) {
	 // a - any number 
	 // b - any positive number or zero 
	 if(b < 0) {
		 throw new IllegalArgumentException(" Pow cannot be negative");
	 }
	 long res = 1;
	 if(b > 0) {
		 res = plus(a, pow(a, b-1)); // a^b = a * a^(b-1) 
	 }
	 return res;
 	}
 
    private static long plus(long x,long l) {   
	return l == 0 ? 0: x + plus(x, l -1);
    }
    
	public static long sum(int[]array) { 
    	return sum(0,array);
    }
	
	private static long sum(int firstIndex, int[] array) {
		long sum = 0;
		if (firstIndex < array.length) {
			sum = array[firstIndex] + sum(firstIndex +1 ,array);
		}
		return sum;
	}
	
	public static int[] reverse(int[]array) {
		return reverse(array, 0, array.length -1);
	}
	
	private static int[] reverse(int[] array, int left, int right) {
		
		if(left < right) {
			array[left] = array[left] + array[right];
			array[right] = array[left] - array[right];
			array[left] = array[left] - array[right];
			reverse(array , left + 1,right - 1);
		}
		return array;
	}
	
	public static long square(int x ) {
		
		 return (x == 0) ? 0 : ((x < 0) ? square(-x) : (x + square(x - 1) + x - 1));
	}
	
	public static boolean isSubstring(String string,String substr) {
		boolean indeed = false;
	    if(substr.length() > string.length()) {
	    	throw new Error(" Subsstring biger then string");
	    }
	    
		
		return indeed;
	}
	private boolean itSame(String str,String subStr) {
		if(str.charAt(0) == subStr.charAt(0)) {
			
			
			
			
			
		}
		
		return true;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
