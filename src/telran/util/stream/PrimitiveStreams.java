package telran.util.stream;

import java.util.Random;

import telran.util.ArrayList;

public class PrimitiveStreams {
    public static int[] randomUnique(int nNumbers, int minInclusive, int maxExclusive) {
    	if(maxExclusive- minInclusive < nNumbers) {
    		throw new IllegalArgumentException("impossible to get the given amount of unique numbers");
    	}
    	
    	return new Random().ints(minInclusive, maxExclusive).distinct().limit(nNumbers).toArray();
    }
	
	static public int[] shuffle(int[] array) {
		ArrayList<Integer> shuffledAr = new ArrayList<>(array.length);
		Random random = new Random();
		for (int numb : array) {
		int index = random.nextInt(shuffledAr.size() + 1); 
		shuffledAr.add(index, numb); 
		}
		return shuffledAr.stream().mapToInt(Integer::intValue).toArray();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
