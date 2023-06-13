package telran.util.stream.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import telran.util.HashSet;
import telran.util.stream.PrimitiveStreams;

import static telran.util.stream.PrimitiveStreams.*;


;class PrimitiveStreamTest {

	private static final int MIN_NUMBER = 1;
	private static final int MAX_NUMBER = 2_000_000_000;
	private static final int N_NUMBERS = 1_000_000;
	private static final int N_RUNS = 2                                ;

	@Test
	void uniqueRandomTest() {
		int []arrayPrev = randomUnique(N_NUMBERS, MIN_NUMBER, MAX_NUMBER);
		
		runUniqueTest(arrayPrev);
		for(int i = 0; i < N_RUNS; i++) {
			int []arrayNext  = randomUnique(N_NUMBERS, MIN_NUMBER, MAX_NUMBER);
			runUniqueTest(arrayNext);
			runUniqueTest(arrayPrev);
			runArrayNotEqualTest(arrayPrev,arrayNext);
			
		}
	}

	private void runArrayNotEqualTest(int[] arrayPrev, int[] arrayNext) {
		
		int index = 0;
		if(arrayPrev.length == arrayNext.length) {
			while(index < arrayPrev.length && arrayPrev[index] == arrayNext[index]) {
				index++;
			}
		}
		assertTrue(index < arrayPrev.length);
	}

	private void runUniqueTest(int[] array) {
		HashSet<Integer> set = new HashSet<>();
		for(int num: array) {
			set.add(num);
		}
		assertEquals(array.length, set.size());
	}
	@Test
	void shuffleTest() {
		int[]array = {1,2,3,4,5,6,7,8,9};
		int[]shuffled = PrimitiveStreams.shuffle(array);
		runArrayNotEqualTest(array,shuffled);
//		for(int num:shuffled) {
//			System.out.print(num);
//		}
	}
	
}
