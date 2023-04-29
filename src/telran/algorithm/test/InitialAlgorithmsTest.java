package telran.algorithm.test;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import static telran.algorithm.InitialAlgorithms.*;

class InitialAlgorithmsTest {
	int[] helper = new int[100000];
	void setUp() {
		
		for( int i = 0; i < helper.length; i++) {
			helper[i] = (short)(Math.random() * Short.MAX_VALUE);
			
		}
		}
	@Test
	void runSortedArrayTest() {
		//..........
	}

	
	
	@Test
	void testSortShortPositive() {
		short [] array =    {5,1,55,13,67,88};
		sortShortPositive(array);
		short [] expected = {1,5,13,55,67,88};
		assertArrayEquals(expected,array);
	}

	@Test
	void testIsSum2() {
		short [] array =   {1,5,13,55,67,88};
		assertTrue(isSum2(array, (short)14));
		assertTrue(isSum2(array, (short)68));
		assertTrue(isSum2(array, (short)6));
		assertFalse(isSum2(array, (short)15));
	}

	@Test
	void testBubbleSort() {
		short [] sorted =   {-55,-5,1,5,13,55, 67 ,88};
		short [] array =   {1,5,13,55, 67,-55,-5 ,88};
		bubbleSort(array);
		assertArrayEquals(sorted, array);
	}

	@Test
	void testGetMaxPositiveWithNegativeReflect() {
		short [] array =   {-55,-5,1,5,13,55, 67 ,88};
		short [] array1 =   {1,5,13,55, 67 ,88};
		assertEquals(55, getMaxPositiveWithNegativeReflect(array));
		assertEquals(-1, getMaxPositiveWithNegativeReflect(array1));
	}

}
