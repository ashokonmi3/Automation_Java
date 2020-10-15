package tng.framework;

import org.testng.annotations.Test;

public class TNG_11_ParallelExecution_01 {
	@Test
	public void testCase1() throws InterruptedException {
		long id = Thread.currentThread().getId();
		System.out.println("Test Case 1 is Successful - Thread id is: " + id);
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			System.out.println("Test Case 1 from Class 1");
			Thread.sleep(2000);
		}
	}

	@Test
	public void testCase2() throws InterruptedException {
		long id = Thread.currentThread().getId();
		System.out.println("Test Case 2 is Successful - Thread id is: " + id);
		for (int i = 20; i < 30; i++) {
			System.out.println(i);
			System.out.println("Test Case 2 from Class 1");
			Thread.sleep(2000);
		}
	}

	@Test
	public void testCase3() throws InterruptedException {
		long id = Thread.currentThread().getId();
		System.out.println("Test Case 3 is Successful - Thread id is: " + id);
		for (int i = 30; i < 40; i++) {
			System.out.println(i);
			System.out.println("Test Case 3 from Class 1");
			Thread.sleep(2000);
		}
	}

}
