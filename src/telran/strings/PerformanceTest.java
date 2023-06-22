package telran.strings;

abstract class PerformanceTest {
	private String testName;
	private int nRuns;
	
	
	public PerformanceTest(String testName,int nRuns) {
		this.testName = testName;
		this.nRuns = nRuns;
	}
	
	public abstract void runTest();
	
	public void run() {
		long timeBefore = System.currentTimeMillis();
		
		for(int i = 0;i < nRuns;i++) {
			runTest();
		}
		
		long timeAfter = System.currentTimeMillis();
		
		System.out.println("Value of Runs:  " + nRuns);
		System.out.println("Test name:      " + testName);
		System.out.println("Running time:   " + (timeAfter - timeBefore) + "ms" );
	}

}
