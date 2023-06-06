package telran.algorithm.recursion.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import telran.algorithm.recursion.LineRecursion;

class LineRecursionTest {

	@Test
	@Disabled
	void test() {
		f(4);
	}

	private void f(int a) {
		if(a > 5) {
			System.out.println(a);
			f(a-1);
		}
		
	}
	@Test
	void factorialTest() {
		
		assertEquals(6, LineRecursion.factorial(3));
		assertEquals(24, LineRecursion.factorial(4));
		assertEquals(1, LineRecursion.factorial(0));

	}
	@Test
	void powerTest() {
		assertEquals(3, LineRecursion.pow(3, 1));
		assertEquals(3125, LineRecursion.pow(5, 5));
		assertEquals(32, LineRecursion.pow(2, 5));
		assertEquals(1, LineRecursion.pow(5, 0));
	}
	@Test 
	void sumTest(){
		assertEquals(21, LineRecursion.sum(new int[] {1,2,3,4,5,6}));
	}
	@Test
	void reverseTest() {
		int array[] = {1,2,3,4,5,6};
		int array1[] = {1,2,3,4,5,6,7};
		int expected[] = {6,5,4,3,2,1};
		int expected1[] = {7,6,5,4,3,2,1};
		assertArrayEquals(expected, LineRecursion.reverse(array));
		assertArrayEquals(expected1, LineRecursion.reverse(array1));
	}
	@Test
	void squareTest() {
		assertEquals(25, LineRecursion.square(5));
		assertEquals(100, LineRecursion.square(10));
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
