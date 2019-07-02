package basicAnnotations;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgClass {

			
	@Test(dependsOnMethods = {"test2","test3"})
	public void test1() {
		System.out.println("Testing first method");
	}
	@Test
	public void test2() {
		System.out.println("Testing second method");
		throw new SkipException("Testing");
	}
	@Test
	public void test3() {
		System.out.println("Testing third method");
		Assert.fail("Testing failure");
	}

	@Test
	public void test4() {
		System.out.println("Testing fourth method");
		Assert.assertEquals("123", "456");
	}
}

