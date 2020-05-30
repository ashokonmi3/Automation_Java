package maven.test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MultipleTest {
	@Test
	public void f1() {
		Assert.assertEquals("Gmail", "Gmail");
	}
}
