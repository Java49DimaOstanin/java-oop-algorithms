package telran.strings.test;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import telran.strings.*;

public class StringTests {
	private static final int N_STRINGS = 1000000;
	private static final int N_RUNS = 1000000;
	String[] strings = {"Hello", "Hello", "Hello"};
	String expected = "Hello#Hello#Hello"; 
	@Test
	void joinBuilderTest() {
		JoinStrings js = new JoinStringsBuilderImpl();
		String[] string = getStrings();
		String expected = getExpected();
		runTest(js, strings );
	}
	@Test
	void joinStrinsTest() {
		JoinStrings js = new JoinStringImpl();
		String[] string = getStrings();
//		String expected = getExpected();
		runTest(js, strings  );
	}
	
	
	
	
	
	private void runTest(JoinStrings js, String[] strings2) {
		for(int i = 0; i < N_RUNS;i++) {
			js.join(strings2, "#");
		}
		
	}
	private String getExpected() {
		
		return expected;
	}
	private String[] getStrings() {
		String [] res = new String[N_STRINGS];
		for(int i = 0; i < N_STRINGS; i++) {
			res[i] = "Hello";
		}
		return res; 
	}
}
