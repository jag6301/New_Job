package test_ng;

import org.testng.annotations.Test;

public class Grooping_Test_Case {
	
	@Test(groups = "Regression")
	public void testcase1()
	{
		System.out.println("TEST CASE 1");
	}
	@Test(groups = {"Rest","sanity"})
	public void testcase2()
	{
		System.out.println("TEST CASE 2");
	}
	@Test(groups = "Regression")
	public void testcase3()
	{
		System.out.println("TEST CASE 3");
	}
	@Test(groups = "Rest")
	public void testcase4()
	{
		System.out.println("TEST CASE 4");
	}


}
