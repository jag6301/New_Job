package test_ng;

import org.testng.annotations.Test;

public class Depends_On_Method {
	
	@Test(priority = 1)
	public void testcase1()
	{
		System.out.println("TEST CASE 1");
	}
	@Test(priority = 2)
	public void testcase2()
	{
		System.out.println("TEST CASE 2");
	}
	@Test(priority = 3,dependsOnMethods = "testcase2")
	public void testcase3()
	{
		System.out.println("TEST CASE 3");
	}
	@Test(priority = 4)
	public void testcase4()
	{
		System.out.println("TEST CASE 4");
	}

}
