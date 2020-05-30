package maven.test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoTest {
	@Test
	public void testA() {
		Assert.assertEquals("Gmail", "Gmail");
	}

	@Test
	public void testC() {
		Assert.assertEquals("Gmail", "Gmail");
	}

	@Test
	public void testB() {
		Assert.assertEquals("Yahoo", "Yahoo");
	}
}
