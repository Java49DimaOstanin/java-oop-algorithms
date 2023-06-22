package telran.strings;

public class JoinStringsPerformanceAppl {
	
	
	
	
	private static final int N_STRINGS = 1000;

	public static void main(String[] args) {
		
		String[] strings = new String[N_STRINGS];
		
		for(int i = 0;i < N_STRINGS;i++) {
			strings[i] = "Hello-World";
		}
		
		JoinStringsPerformanceTest test1 = new JoinStringsPerformanceTest("ConCat Join Test", 1000, strings, new JoinStringImpl());
		test1.run();
		
		System.out.println("*************************************");
		
		JoinStringsPerformanceTest test2 = new JoinStringsPerformanceTest("Builder Join Test", 1000, strings, new JoinStringsBuilderImpl());
		test2.run();
		
		
		
		
	}
}
