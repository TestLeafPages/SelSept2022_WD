package week5.day1testcase;

import org.testng.annotations.Test;

public class MulipleTests {
	@Test(priority = -1)
	public void run() {
		System.out.println("Test1 got executed");
	}
	@Test(priority = 5)
	public void walk() {
		System.out.println("Test2 got executed");
	}
	@Test(priority = 2)
	public void sleep() {
		System.out.println("Test3 got executed");
	}
	

}
