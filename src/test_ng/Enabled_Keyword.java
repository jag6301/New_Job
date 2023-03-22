package test_ng;

import org.testng.annotations.Test;

public class Enabled_Keyword {
	
	@Test
	public void testcase1()
	{
		System.out.println("TEST CASE 1");
	}
	@Test(enabled = true)
	public void testcase2()
	{
		System.out.println("TEST CASE 2");
	}
	@Test(enabled = false)
	public void testcase3()
	{
		System.out.println("TEST CASE 3");
	}
	@Test
	public void testcase4()
	{
		System.out.println("TEST CASE 4");
	}

}
