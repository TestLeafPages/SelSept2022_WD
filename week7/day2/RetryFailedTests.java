package week5.day1testcase;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryFailedTests implements IRetryAnalyzer{

	int count=0;
	public boolean retry(ITestResult result) {
		
		if (count<2) {
			count++;
			return true;//continue the retry
		}
		
		return false;//stop the retry
	}
	

}
